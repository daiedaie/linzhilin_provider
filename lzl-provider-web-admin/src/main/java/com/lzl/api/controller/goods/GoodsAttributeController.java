package com.lzl.api.controller.goods;

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

import io.swagger.annotations.ApiOperation;

import com.lzl.util.WebUtil;
import com.lzl.common.Pager;
import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.goods.GoodsAttribute;
import com.lzl.service.goods.IGoodsAttributeService;


/**
* 描述：GoodsAttribute控制层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-14 14:31:18
*/
@RestController
@RequestMapping(value = "/goodsAttribute")
public class GoodsAttributeController extends BaseController  {

    @Autowired
    private IGoodsAttributeService goodsAttributeService;

	@SuppressWarnings("unchecked")
    @ApiOperation(value="列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Object> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Pager pager = WebUtil.handlerPager(request);
		ResponseEntity<Object> entity = new ResponseEntity<Object>(goodsAttributeService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		return entity;
    }
	
	@ApiOperation(value="更新", notes="必传：goodsAttributeId ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody GoodsAttribute goodsAttribute) throws Exception {
		goodsAttributeService.put(goodsAttribute);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }

}