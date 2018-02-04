package com.lzl.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.bean.javashop.Goods;
import com.lzl.common.Pager;
import com.lzl.service.IGoodsService;
import com.lzl.util.WebUtil;

import io.swagger.annotations.ApiOperation;
  
@RestController
@RequestMapping(value="/goods")
public class GoodsController extends BaseController {

	@Resource(name="goodsService")
	private IGoodsService goodsService;
	 
	@ApiOperation(value="商品列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<List<Goods>> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		//以下1和2都应放入LogAspect.java中
		Map<String, Object> queryMap = new HashMap<>();
		
		//1.处理post请求的中文乱码
		request.setCharacterEncoding("UTF-8");  
		response.setContentType("text/html;charset=UTF-8");  

		//2.处理get请求的中文乱码
		if ("GET".equals(request.getMethod())) {//GET请求时的参数  
			String rawQueryStr = request.getQueryString();  
			String queryStr = java.net.URLDecoder.decode(rawQueryStr , "utf-8");
			
			if (!StringUtils.isEmpty(queryStr)) {
				String[] arr = queryStr.split("&");
				for (int i = 0; i < arr.length; i++) {
					String key = arr[i].substring(0, arr[i].indexOf("="));
					String value = arr[i].substring(arr[i].indexOf("=") + 1);
					queryMap.put(key, value);
				}
			}
		}
		
		Pager pager = WebUtil.handlerPager(request);
		ResponseEntity<List<Goods>> entity = new ResponseEntity<List<Goods>>(goodsService.get(queryMap, pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		System.out.println(entity);
		System.out.println(pager.getRowsCount());
		return entity;
    }
	
	@ApiOperation(value="新增商品", notes="必传： ；选传：page,size")
	@RequestMapping(method = { RequestMethod.POST })
	public ResponseEntity<Goods> post(HttpServletRequest request, @RequestBody Goods goods) throws Exception {
		System.out.println("前台传来的goods:" + goods);
		goodsService.post(goods);
		return new ResponseEntity<Goods>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value="删除商品", notes="必传： ；选传：")
	@RequestMapping(value="/{goodsId}", method={ RequestMethod.DELETE })
	public ResponseEntity<Object> delete(HttpServletRequest request, @PathVariable("goodsId") Integer goodsId) throws Exception {
		System.out.println("前台传入的商品Id:" + goodsId);
		goodsService.deleteGoodsById(goodsId);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@ApiOperation(value="修改商品", notes="必传：goodsId ；选传：")
	@RequestMapping(method={ RequestMethod.PUT })
	public ResponseEntity<Object> put(HttpServletRequest reqeust, @RequestBody Goods goods) throws Exception {
		System.out.println("前台传来的goods:" + goods);
		goodsService.put(goods);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
}
