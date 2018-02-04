package com.lzl.api.shiro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class ShiroConfiguration {

	@Bean
	public EhCacheManager getEhCacheManager() {
		EhCacheManager em = new EhCacheManager();
		em.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
		return em;
	}

	@Bean(name = "myShiroRealm")
	public MyShiroRealm myShiroRealm(EhCacheManager cacheManager) {
		MyShiroRealm realm = new MyShiroRealm();
		realm.setCacheManager(cacheManager);
		return realm;
	}

	/**
	 * 现在设置了nginx代理，就不需要在这里进行跨域设置了，本地开发的时候可以开启；
	 */
	@SuppressWarnings({ "unused", "deprecation" })
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		// 对响应头进行CORS授权
		MyCorsRegistration corsRegistration = new MyCorsRegistration("*");
		List<String> allowedOrigins = new ArrayList<>();
		allowedOrigins.add("http://localhost:8080");
		allowedOrigins.add("http://localhost:8088");
		String[] objects = allowedOrigins.toArray(new String[allowedOrigins.size()]);

		corsRegistration
				// 允许向该服务器提交请求的URI，*表示全部允许
				.allowedOrigins("*")
				// 允许提交请求的方法，*表示全部允许
				.allowedMethods(HttpMethod.DELETE.name(), HttpMethod.GET.name(), HttpMethod.HEAD.name(),
						HttpMethod.POST.name(), HttpMethod.PUT.name())
				// 允许的头信息,*标识全部允许
				.allowedHeaders(CrossOrigin.DEFAULT_ALLOWED_HEADERS)
				// 暴露的头信息
				.exposedHeaders(HttpHeaders.SET_COOKIE).exposedHeaders("total")
				// 允许Cookie跨域，在做登录校验的时候有用
				.allowCredentials(CrossOrigin.DEFAULT_ALLOW_CREDENTIALS)
				// 预检请求的缓存时间（秒），即在这个时间段里，对于相同的跨域请求不会再预检了
				.maxAge(CrossOrigin.DEFAULT_MAX_AGE);

		// 注册CORS过滤器
		UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
		// 第一个参数表示过滤的url,*表示过滤所有
		configurationSource.registerCorsConfiguration("/**", corsRegistration.getCorsConfiguration());
		CorsFilter corsFilter = new CorsFilter(configurationSource);

		return new FilterRegistrationBean(corsFilter);
	}

	@Bean(name = "lifecycleBeanPostProcessor")
	public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

	@Bean
	public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
		daap.setProxyTargetClass(true);
		return daap;
	}

	@Bean(name = "securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(MyShiroRealm myShiroRealm) {
		DefaultWebSecurityManager dwsm = new DefaultWebSecurityManager();
		dwsm.setRealm(myShiroRealm);
		// <!-- 用户授权/认证信息Cache, 采用EhCache 缓存 -->
		dwsm.setCacheManager(getEhCacheManager());
		return dwsm;
	}

	@Bean
	public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor(
			DefaultWebSecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
		aasa.setSecurityManager(securityManager);
		return aasa;
	}

	/**
	 * 加载shiroFilter权限控制规则
	 */
	private void loadShiroFilterChain(ShiroFilterFactoryBean shiroFilterFactoryBean) {

		Map<String, Filter> filters = new HashMap<String, Filter>();
		filters.put("authc", new ResourceCheckFilter());
		shiroFilterFactoryBean.setFilters(filters);

		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
		filterChainDefinitionMap.put("/login", "anon");
		filterChainDefinitionMap.put("/", "anon");
		filterChainDefinitionMap.put("/systemAdmin/login", "anon");
		filterChainDefinitionMap.put("/exit", "anon");
		filterChainDefinitionMap.put("/unauth", "anon");
	    filterChainDefinitionMap.put("/tologin", "anon");
		
		filterChainDefinitionMap.put("/swagger-resources", "anon");
		filterChainDefinitionMap.put("/swagger-ui.html", "anon");
		filterChainDefinitionMap.put("/webjars/springfox-swagger-ui/", "anon");
		filterChainDefinitionMap.put("/v2/api-docs", "anon");
		filterChainDefinitionMap.put("/configuration/security", "anon");
		filterChainDefinitionMap.put("/configuration/ui", "anon");
		
		filterChainDefinitionMap.put("/**", "authc");

		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
	}

	/***/
	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		shiroFilterFactoryBean.setLoginUrl("/login");
		loadShiroFilterChain(shiroFilterFactoryBean);
		return shiroFilterFactoryBean;
	}

}
