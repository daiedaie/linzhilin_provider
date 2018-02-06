package com.lzl.api.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.bean.javashop.Orders;
import com.lzl.bean.javashop.ProviderOrders;
import com.lzl.common.Pager;
import com.lzl.service.IProviderOrdersService;
import com.lzl.util.WebUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/providerOrders")
public class ProviderOrdersController extends BaseController {

	@Resource
	private IProviderOrdersService providerOrdersService;

	@ApiOperation(value="供应商订单列表", notes="必传： ；选传：page,size")
	@RequestMapping(method={ RequestMethod.GET })
	public ResponseEntity<List<ProviderOrders>> get(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Pager pager = WebUtil.handlerPager(request);
		
		@SuppressWarnings("unchecked")
		ResponseEntity<List<ProviderOrders>> entity = new ResponseEntity<List<ProviderOrders>>(providerOrdersService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		
		System.out.println("查询到的所有ProviderOrders:" + entity);
		System.out.println("查询到的ProviderOrders总数:" + String.valueOf(pager.getRowsCount()));
		
		return entity;
		
		
	}
}
