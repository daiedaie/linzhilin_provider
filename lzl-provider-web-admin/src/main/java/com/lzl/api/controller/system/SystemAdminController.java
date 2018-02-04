package com.lzl.api.controller.system;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.SystemAdmin;
import com.lzl.bean.javashop.SystemResources;
import com.lzl.common.Pager;
import com.lzl.exception.BusinessException;
import com.lzl.service.ISystemAdminService;
import com.lzl.service.ISystemResourcesService;
import com.lzl.util.Md5;
import com.lzl.util.WebAdminSession;
import com.lzl.util.WebUtil;

import io.swagger.annotations.ApiOperation;


/**
* 描述：SystemAdmin控制层
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
*/
@RestController
@RequestMapping(value = "/systemAdmin")
public class SystemAdminController extends BaseController  {
	
	private final Logger        log          = LogManager.getLogger(this.getClass());

    @Autowired
    private ISystemAdminService systemAdminService;
    @Resource
    private ISystemResourcesService systemResourcesService;
    
    @RequestMapping(value = "/login", method = { RequestMethod.POST })
    public ResponseEntity<Object> doLogin(HttpServletRequest request,@RequestBody SystemAdmin admin) throws Exception {
        String name = admin.getName();
        String password = admin.getPassword();
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
        SystemAdmin adminUser = (SystemAdmin) subject.getPrincipal();
        WebAdminSession.putAdminUser(request, adminUser);
        
        List<String> resourceList = systemResourcesService.getResourceByRoleId(adminUser.getRoleId(), SystemResources.S_ADMIN);
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
        adminUser.setUrls(builder.toString());

        return new ResponseEntity<Object>(adminUser,HttpStatus.OK);
    }

	@SuppressWarnings("unchecked")
    @ApiOperation(value="系统管理员表列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Object> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Pager pager = WebUtil.handlerPager(request);
		ResponseEntity<Object> result = new ResponseEntity<Object>(systemAdminService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		return result;
    }
	
	@ApiOperation(value="系统管理员表新增", notes="必传： ；选传：")
    @RequestMapping(method = { RequestMethod.POST })
    public ResponseEntity<Object> post(HttpServletRequest request,@RequestBody SystemAdmin systemAdmin) throws Exception {
	    SystemAdmin adminUser = (SystemAdmin) SecurityUtils.getSubject().getPrincipal();
	    systemAdmin.setCreateUser(adminUser.getId());
		systemAdminService.post(systemAdmin);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
    }
	
	@ApiOperation(value="系统管理员表更新", notes="必传：id ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody SystemAdmin systemAdmin) throws Exception {
		systemAdminService.put(systemAdmin);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }
	
    @RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
    public ResponseEntity<Object> delete(HttpServletRequest request,@PathVariable("id") Integer id) throws Exception {
        systemAdminService.delete(id);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}