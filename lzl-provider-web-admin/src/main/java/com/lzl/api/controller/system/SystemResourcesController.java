package com.lzl.api.controller.system;

import java.util.Map;

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
import com.lzl.bean.javashop.SystemResources;
import com.lzl.common.Pager;
import com.lzl.service.ISystemResourcesService;
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
public class SystemResourcesController extends BaseController  {

    @Autowired
    private ISystemResourcesService systemResourcesService;

	@SuppressWarnings("unchecked")
    @ApiOperation(value="系统资源表列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Object> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Pager pager = WebUtil.handlerPager(request);
		ResponseEntity<Object> result = new ResponseEntity<Object>(systemResourcesService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		return result;
    }
	
	@ApiOperation(value="系统资源表新增", notes="必传： ；选传：")
    @RequestMapping(method = { RequestMethod.POST })
    public ResponseEntity<Object> post(HttpServletRequest request,@RequestBody SystemResources systemResources) throws Exception {
		systemResourcesService.post(systemResources);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
    }
	
    @RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
    public ResponseEntity<Object> delete(HttpServletRequest request,@PathVariable("id") Integer id) throws Exception {
        systemResourcesService.delete(id);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}