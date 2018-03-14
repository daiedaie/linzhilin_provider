package com.lzl.api.controller.tax;

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

import io.swagger.annotations.ApiOperation;

import com.lzl.util.WebUtil;
import com.lzl.common.Pager;
import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.tax.TaxRate;
import com.lzl.service.tax.ITaxRateService;


/**
* 描述：TaxRate控制层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-10 16:28:18
*/
@RestController
@RequestMapping(value = "/taxRate")
public class TaxRateController extends BaseController  {

    @Autowired
    private ITaxRateService taxRateService;

	@SuppressWarnings("unchecked")
    @ApiOperation(value="列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Object> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Pager pager = WebUtil.handlerPager(request);
		ResponseEntity<Object> entity = new ResponseEntity<Object>(taxRateService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		return entity;
    }
	
	@ApiOperation(value="更新", notes="必传：taxRateId ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody TaxRate taxRate) throws Exception {
		taxRateService.put(taxRate);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }
	
	@ApiOperation(value="新增", notes="必传：taxRateId ；选传：")
	@RequestMapping(method = { RequestMethod.POST })
	public ResponseEntity<Object> post(HttpServletRequest request,@RequestBody TaxRate taxRate) throws Exception {
		taxRateService.post(taxRate);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	 
	@ApiOperation(value="删除", notes="必传：taxRateId ；选传：")
	@RequestMapping(value = "/{taxRateId}", method = { RequestMethod.DELETE })
	public ResponseEntity<Object> delete(HttpServletRequest request,@PathVariable("taxRateId") Integer taxRateId) throws Exception {
		taxRateService.delete(taxRateId);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

}