package com.lzl.api.controller;

import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.bean.javashop.Orders;
import com.lzl.common.Pager;
import com.lzl.service.IOrdersService;
import com.lzl.util.WebUtil;

import io.swagger.annotations.ApiOperation;


/**
* 描述：Orders控制层
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
*/
@RestController
@RequestMapping(value = "/orders")
public class OrdersController extends BaseController {
    
    private final Logger        logger          = LogManager.getLogger(this.getClass());

    @Autowired
    private IOrdersService ordersService;

    @ApiOperation(value="订单详细信息")
    @RequestMapping(value = "/{id}", method = { RequestMethod.GET })
    public ResponseEntity<Orders> getById(HttpServletRequest request,@PathVariable("id") Integer id) throws Exception {
		return new ResponseEntity<Orders>(ordersService.getById(id),HttpStatus.OK);
    }

	@SuppressWarnings("unchecked")
    @ApiOperation(value="订单列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<List<Orders>> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Pager pager = WebUtil.handlerPager(request);
		ResponseEntity<List<Orders>> entity = new ResponseEntity<List<Orders>>(ordersService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		return entity;
    }
	
	@ApiOperation(value="订单新增", notes="必传： ；选传：")
    @RequestMapping(method = { RequestMethod.POST })
    public ResponseEntity<Object> post(HttpServletRequest request,@RequestBody Orders orders) throws Exception {
		ordersService.post(orders);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
    }
	
	@ApiOperation(value="订单更新", notes="必传：id ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody Orders orders) throws Exception {
		ordersService.put(orders);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }
	
    @SuppressWarnings("unchecked")
    @RequestMapping(value="/down",method = { RequestMethod.GET })
    public void down(HttpServletRequest request,HttpServletResponse response) throws Exception {
        // 下载文件的默认名称
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("订单数据","UTF-8") + ".xls");
        long start = new Date().getTime();
        List<Orders> list = ordersService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),null);
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(), Orders.class, list);
        logger.info("*********************************订单数据导出耗时： " + ((new Date().getTime()-start)/1000) + " 秒");
        workbook.write(response.getOutputStream());
    }

}