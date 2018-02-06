package com.lzl.api.shiro;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.util.StringUtils;

import com.lzl.bean.javashop.ProviderUser;
import com.lzl.bean.javashop.SystemResources;
import com.lzl.service.IProviderUserService;
import com.lzl.service.ISystemResourcesService;

public class MyShiroRealm extends AuthorizingRealm{

    private final Logger log = LogManager.getLogger(this.getClass());

    @Resource
    private ISystemResourcesService systemResourcesService;
    @Resource
    private IProviderUserService providerUserService;

    /**
     * Shiro登录认证(原理：用户提交 用户名和密码  --- shiro 封装令牌 ---- realm 通过用户名将密码查询返回 ---- shiro 自动去比较查询出密码和用户输入密码是否一致---- 进行登陆控制 )
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        log.info("Shiro开始登录认证");
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;

        Map<String,Object> queryMap = new HashMap<>();
        queryMap.put("username", token.getUsername());
        List<ProviderUser> providerUserList = new ArrayList<>();
        try{
        	providerUserList = providerUserService.get(queryMap,null);
        }catch(Exception e){
        	log.error(e);
        }

        System.out.println("Shiro用户验证时后台查询到的providerUserList：" + providerUserList);
        // 账号不存在
        if (providerUserList == null || providerUserList.size() == 0) {
            log.error("用户不存在，用户名：" + token.getUsername());
            throw new UnknownAccountException();
        }
        // 账号名重复
        if (providerUserList.size() > 1) {
            log.error("用户重复，用户名：" + token.getUsername());
            return null;
        }

        ProviderUser providerUser = providerUserList.get(0);
        
        // 账号未启用
        if (providerUser.getState() == null || providerUser.getState().intValue() != 1) {
            log.error("用户账号已停用，用户名：" + token.getUsername());
            throw new DisabledAccountException();
        }
        // 认证缓存信息
        return new SimpleAuthenticationInfo(providerUser, providerUser.getPassword().toCharArray(),
            getName());

    }

    /**
     * Shiro权限认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        log.info("---------------------doGetAuthorizationInfo start" + new Date());
        ProviderUser providerUser = (ProviderUser) principals.getPrimaryPrincipal();

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> urlSet = new HashSet<String>();
        
        try{
            List<String> resourceList = systemResourcesService
                    .getResourceByRoleId(providerUser.getProviderRolesId(), SystemResources.S_PROVIDER);	
            
            if (resourceList == null || resourceList.size() == 0) {
                log.error("该用户所属角色没有任何权限");
            }
            if (resourceList != null && resourceList.size() > 0) {
                for (String url : resourceList) {
                    //log.info("*********************** url : "+url);//在每次请求访问的时候会到这里，不是初始化的时候到这里
                    if (!StringUtils.isEmpty(url)) {
                        // 用逗号分隔资源表的url字段，该字段可存储多个url，并用英文逗号（，）分隔
                        String[] split = url.split(",");
                        for (String urlSplit : split) {
                            // 如果url中带参数，则截去参数部分
                            int indexOf = urlSplit.indexOf("?");
                            if (indexOf != -1) {
                                urlSplit = urlSplit.substring(0, indexOf);
                            }
                            //这个判断是为了rest而加上的，不是rest可以删掉；
//                            if(urlSplit.indexOf(":") == -1){
//                                urlSplit = urlSplit + ":read";
//                            }
                            log.info("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + urlSplit);
                            urlSet.add(urlSplit);
                        }
                    }
                }
            }
        }catch(Exception e){
        	log.error(e);
        }
        
        System.out.println("shiro中该providerUser用户的权限集合:" + urlSet);
        info.addStringPermissions(urlSet);
        log.info("---------------------doGetAuthorizationInfo end" + new Date());

        return info;
    }
}