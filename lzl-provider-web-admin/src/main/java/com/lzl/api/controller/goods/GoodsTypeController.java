package com.lzl.api.controller.goods;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.goods.GoodsType;
import com.lzl.common.Pager;
import com.lzl.service.goods.IGoodsTypeService;
import com.lzl.util.WebUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/goodsType")
public class GoodsTypeController extends BaseController {

	@Autowired
	private IGoodsTypeService goodsTypeService;
	
	@ApiOperation(value="查询商品属性", notes="")
	@RequestMapping(method = { RequestMethod.GET })
	public ResponseEntity<List<GoodsType>> get(HttpServletRequest request, HttpServletResponse response) throws Exception{
		Map<String, Object> queryMap = WebUtil.getParamMap(request);
		Pager pager = WebUtil.handlerPager(request, queryMap);
		ResponseEntity<List<GoodsType>> entity = new ResponseEntity<List<GoodsType>>(goodsTypeService.get(queryMap, pager), HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		System.out.println(entity);
	
		return entity;
	}
	
}
