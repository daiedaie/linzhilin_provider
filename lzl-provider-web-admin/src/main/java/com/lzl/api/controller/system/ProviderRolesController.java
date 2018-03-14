package com.lzl.api.controller.system;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.system.ProviderResources;
import com.lzl.bean.javashop.system.ProviderRoles;
import com.lzl.common.Pager;
import com.lzl.service.system.IProviderResourcesService;
import com.lzl.service.system.IProviderRolesService;
import com.lzl.util.WebUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/providerRoles")
public class ProviderRolesController extends BaseController {

	@Resource
	private IProviderRolesService providerRolesService;
	
	@Autowired
    private IProviderResourcesService providerResourcesService;
	
	@SuppressWarnings("unchecked")
	@ApiOperation(value="供应商用户角色表", notes="")
	@RequestMapping(method={ RequestMethod.GET })
	public ResponseEntity<List<ProviderRoles>> get(HttpServletRequest request, HttpServletResponse response) throws Exception{
		Pager pager = WebUtil.handlerPager(request);
		List<ProviderRoles> entity = providerRolesService.get((Map<String, Object>)request.getAttribute("QUERYMAP"), pager);
		System.out.println("request.getAttribute(QUERYMAP)" + request.getAttribute("QUERYMAP"));
		System.out.println("获取的所有ProviderRoles：" + entity);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		return new ResponseEntity<List<ProviderRoles>>(entity, HttpStatus.OK);
	}
	
	@RequestMapping(method={ RequestMethod.PUT })
	public ResponseEntity<Object> put(HttpServletRequest request, @RequestBody ProviderRoles providerRoles) throws Exception{
		providerRolesService.put(providerRoles);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping(method ={ RequestMethod.POST })
	public ResponseEntity<Object> post(HttpServletRequest request, @RequestBody ProviderRoles providerRoles) throws Exception{
		providerRolesService.post(providerRoles);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/{providerRolesId}", method={ RequestMethod.DELETE })
	public ResponseEntity<Object> deleteById(@PathVariable("providerRolesId") Integer providerRolesId) throws Exception{
		providerRolesService.deleteProviderRolesById(providerRolesId);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/resources/{providerRolesId}",method = { RequestMethod.GET })
    public ResponseEntity<Object> get(HttpServletRequest request,HttpServletResponse response,@PathVariable("providerRolesId") Integer providerRolesId) throws Exception {
        ResponseEntity<Object> result = new ResponseEntity<Object>(providerResourcesService.getResourceIdByRoleId(providerRolesId,ProviderResources.S_PROVIDER),HttpStatus.OK);
        return result;
    }
}
