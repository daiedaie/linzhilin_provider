package com.lzl.api.controller.repository;

import java.util.HashMap;
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
import com.lzl.bean.javashop.repository.Repository;
import com.lzl.common.Pager;
import com.lzl.service.repository.IRepositoryService;

import io.swagger.annotations.ApiOperation;


/**
* 描述：Repository控制层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-12 10:28:45
*/
@RestController
@RequestMapping(value = "/repository")
public class RepositoryController extends BaseController  {

    @Autowired
    private IRepositoryService repositoryService;

	@SuppressWarnings("unchecked")
    @ApiOperation(value="列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Object> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		ResponseEntity<Object> entity = new ResponseEntity<Object>(repositoryService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),new Pager()),HttpStatus.OK);
		return entity;
    }
	
	@ApiOperation(value="列表", notes="必传： ；选传：page,size")
	@RequestMapping(value="/getTopLevel", method = { RequestMethod.GET })
	public ResponseEntity<Object> getTopLevel() throws Exception {
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("levelType", 0);
		ResponseEntity<Object> entity = new ResponseEntity<Object>(repositoryService.get(queryMap, new Pager()),HttpStatus.OK);
		return entity;
	}
	
	@ApiOperation(value="更新", notes="必传：repositoryId ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody Repository repository) throws Exception {
		System.out.println("*************put*********");
		System.out.println("*******repository*********" + repository);
		repositoryService.put(repository);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }
	
	@ApiOperation(value="新增", notes="必传：repositoryId ；选传：")
	@RequestMapping(method = { RequestMethod.POST })
	public ResponseEntity<Object> post(HttpServletRequest request,@RequestBody Repository repository) throws Exception {
		System.out.println("*************post*********");
		repositoryService.post(repository);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@ApiOperation(value="删除", notes="必传：repositoryId ；选传：")
	@RequestMapping(value="/{id}", method = { RequestMethod.DELETE })
	public ResponseEntity<Object> delete(HttpServletRequest request,@PathVariable("id")Integer repositoryId) throws Exception {
		System.out.println("*************delete*********");
		repositoryService.deleteById(repositoryId);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

}