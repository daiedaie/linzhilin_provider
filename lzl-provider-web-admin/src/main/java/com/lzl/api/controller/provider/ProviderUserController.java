package com.lzl.api.controller.provider;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.ProviderUser;
import com.lzl.bean.javashop.SystemResources;
import com.lzl.common.Pager;
import com.lzl.exception.BusinessException;
import com.lzl.service.IProviderUserService;
import com.lzl.service.ISystemResourcesService;
import com.lzl.util.Md5;
import com.lzl.util.WebProviderSession;
import com.lzl.util.WebUtil;

import io.swagger.annotations.ApiOperation;


/**
* 描述：ProviderUser控制层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-04 14:12:24
*/
@RestController
@RequestMapping(value = "/providerUser")
public class ProviderUserController extends BaseController  {
	
	private final Logger log = LogManager.getLogger(this.getClass());

    @Resource
    private IProviderUserService providerUserService;
    @Resource
    private ISystemResourcesService systemResourcesService;
    
    @RequestMapping(value = "/login", method = { RequestMethod.POST })
    public ResponseEntity<Object> doLogin(HttpServletRequest request,@RequestBody ProviderUser user) throws Exception {
        System.out.println("登陆页面传来的数据providerUser:" + user);
    	String name = user.getUsername();
        String password = user.getPassword();
        log.info("登录用户：" + name);
        if (StringUtils.isEmpty(name)) throw new BusinessException("用户名不能为空");
        if (StringUtils.isEmpty(password)) throw new BusinessException("密码不能为空");
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(name,Md5.getMd5String(password).toCharArray());
        // token.setRememberMe(true);
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            log.error("账号不存在：{}", e);
            throw new BusinessException("账号不存在");
        } catch (DisabledAccountException e) {
            log.error("账号未启用：{}", e);
            throw new BusinessException("账号未启用");
        } catch (IncorrectCredentialsException e) {
            log.error("密码错误：{}", e);
            throw new BusinessException("密码错误");
        } catch (RuntimeException e) {
            log.error("未知错误,请联系管理员：{}", e);
            throw new BusinessException("未知错误，请联系管理员");
        }
        ProviderUser providerUser = (ProviderUser) subject.getPrincipal();
        WebProviderSession.putProviderUser(request, providerUser);
        
        System.out.println("ProviderRolesId:" + providerUser.getProviderRolesId());
        System.out.println("scope:" + SystemResources.S_PROVIDER);
        List<String> resourceList = systemResourcesService.getResourceByRoleId(providerUser.getProviderRolesId(), SystemResources.S_PROVIDER);
        System.out.println("该ProviderUser用户的所有权限：" + resourceList);
        
        StringBuilder builder = new StringBuilder();
        if (resourceList != null && resourceList.size() > 0) {
            for (String url : resourceList) {
                if (!StringUtils.isEmpty(url)) {
                    // 用逗号分隔资源表的url字段，该字段可存储多个url，并用英文逗号（，）分隔
                    String[] split = url.split(",");
                    for (String urlSplit : split) {
                        // 如果url中带参数，则截去参数部分
                        int indexOf = urlSplit.indexOf("?");
                        if (indexOf != -1) {
                            urlSplit = urlSplit.substring(0, indexOf);
                        }
                        builder.append(urlSplit).append(",");
                    }
                }
            }
        }
        providerUser.setUrls(builder.toString());

        return new ResponseEntity<Object>(providerUser,HttpStatus.OK);
    }

	@SuppressWarnings("unchecked")
    @ApiOperation(value="商家管理员表列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Object> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Pager pager = WebUtil.handlerPager(request);
		ResponseEntity<Object> result = new ResponseEntity<Object>(providerUserService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		return result;
    }
	
	@ApiOperation(value="商家管理员表新增", notes="必传： ；选传：")
    @RequestMapping(method = { RequestMethod.POST })
    public ResponseEntity<Object> post(HttpServletRequest request,@RequestBody ProviderUser providerUser) throws Exception {
		ProviderUser user = (ProviderUser) SecurityUtils.getSubject().getPrincipal();
		providerUser.setCreateAdminId(user.getUserId());
		providerUserService.post(providerUser);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
    }
	
	@ApiOperation(value="商家管理员表更新", notes="必传：id ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody ProviderUser providerUser) throws Exception {
		providerUserService.put(providerUser);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }
	
    @RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
    public ResponseEntity<Object> delete(HttpServletRequest request,@PathVariable("id") Integer id) throws Exception {
    	providerUserService.deleteProviderUserById(id);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}