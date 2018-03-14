package com.lzl.api.controller.system;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
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
import com.lzl.bean.javashop.system.ProviderUser;
import com.lzl.common.Pager;
import com.lzl.service.system.IProviderResourcesService;
import com.lzl.util.WebUtil;

import io.swagger.annotations.ApiOperation;


/**
* 描述：SystemResources控制层
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:24
*/
@RestController
@RequestMapping(value = "/systemResources")
public class ProviderResourcesController extends BaseController  {

    @Autowired
    private IProviderResourcesService providerResourcesService;

	@SuppressWarnings("unchecked")
    @ApiOperation(value="系统资源表列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Object> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Pager pager = WebUtil.handlerPager(request);
		ResponseEntity<Object> result = new ResponseEntity<Object>(providerResourcesService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		return result;
    }
	
	@ApiOperation(value="系统资源表新增", notes="必传： ；选传：")
    @RequestMapping(method = { RequestMethod.POST })
    public ResponseEntity<Object> post(HttpServletRequest request,@RequestBody ProviderResources providerResources) throws Exception {
		providerResourcesService.post(providerResources);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
    }
	
    @RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
    public ResponseEntity<Object> delete(HttpServletRequest request,@PathVariable("id") Integer id) throws Exception {
    	providerResourcesService.delete(id);
        System.out.println("登陆用户的权限集合：" + ((ProviderUser) SecurityUtils.getSubject().getPrincipal()).getUrls());
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}