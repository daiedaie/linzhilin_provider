package com.lzl.api.controller.system;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.SystemAdmin;
import com.lzl.bean.javashop.SystemResourcesRoles;
import com.lzl.service.ISystemResourcesRolesService;

import io.swagger.annotations.ApiOperation;


/**
* 描述：SystemResourcesRoles控制层
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
*/
@RestController
@RequestMapping(value = "/systemResourcesRoles")
public class SystemResourcesRolesController extends BaseController  {

    @Autowired
    private ISystemResourcesRolesService systemResourcesRolesService;
	
	@ApiOperation(value="系统角色表更新", notes="必传：id ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody SystemResourcesRoles systemResourcesRoles) throws Exception {
        SystemAdmin adminUser = (SystemAdmin) SecurityUtils.getSubject().getPrincipal();
        systemResourcesRoles.setCreateRolesId(adminUser.getRoleId());
		systemResourcesRolesService.put(systemResourcesRoles);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }

}