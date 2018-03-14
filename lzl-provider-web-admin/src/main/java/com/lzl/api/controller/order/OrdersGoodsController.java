package com.lzl.api.controller.order;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.order.OrdersGoods;
import com.lzl.common.Pager;
import com.lzl.service.order.IOrdersGoodsService;
import com.lzl.util.WebUtil;

import io.swagger.annotations.ApiOperation;


/**
* 描述：OrdersGoods控制层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-28 22:27:55
*/
@RestController
@RequestMapping(value = "/ordersGoods")
public class OrdersGoodsController extends BaseController  {

    @Autowired
    private IOrdersGoodsService ordersGoodsService;

	@SuppressWarnings("unchecked")
    @ApiOperation(value="列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Object> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Pager pager = WebUtil.handlerPager(request);
		
		ResponseEntity<Object> entity = new ResponseEntity<Object>(ordersGoodsService.get((Map<String, Object>)request.getAttribute("QUERYMAP"), pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		System.out.println("该订单中的商品:" + entity);
		return entity;
    }
	
	@ApiOperation(value="更新", notes="必传：id ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody OrdersGoods ordersGoods) throws Exception {
		ordersGoodsService.put(ordersGoods);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }

}