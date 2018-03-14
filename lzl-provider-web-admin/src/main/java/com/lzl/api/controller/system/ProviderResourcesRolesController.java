package com.lzl.api.controller.system;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.system.ProviderResourcesRoles;
import com.lzl.bean.javashop.system.ProviderUser;
import com.lzl.service.system.IProviderResourcesRolesService;

import io.swagger.annotations.ApiOperation;


/**
* 描述：providerResourcesRoles控制层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
*/
@RestController
@RequestMapping(value = "/providerResourcesRoles")
public class ProviderResourcesRolesController extends BaseController  {

	@Resource
	private IProviderResourcesRolesService providerResourcesRolesService;
	
	@ApiOperation(value="系统角色表更新", notes="必传：id ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody ProviderResourcesRoles providerResourcesRoles) throws Exception {
        ProviderUser providerUser = (ProviderUser) SecurityUtils.getSubject().getPrincipal();
        providerResourcesRoles.setCreateRolesId(providerUser.getProviderRolesId());
        providerResourcesRolesService.put(providerResourcesRoles);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }

}