package com.lzl.api.controller.provider;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.provider.Provider;
import com.lzl.common.Pager;
import com.lzl.service.provider.IProviderService;
import com.lzl.util.WebUtil;

import io.swagger.annotations.ApiOperation;


/**
* 描述：Provider控制层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
*/
@RestController
@RequestMapping(value = "/providers")
public class ProviderController extends BaseController {
    
    @SuppressWarnings("unused")
	private final Logger logger  = LogManager.getLogger(this.getClass());

    @Resource
    private IProviderService providerService;

	@SuppressWarnings("unchecked")
    @ApiOperation(value="供应商列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<List<Provider>> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Map<String, Object> queryMap = (Map<String, Object>) request.getAttribute("QUERYMAP");
		if(queryMap.get("idsStr") != null){
			ResponseEntity<List<Provider>> entity = new ResponseEntity<List<Provider>>(providerService.getProviderForProviderOrders(queryMap),HttpStatus.OK);
			return entity;
		}else{
			Pager pager = WebUtil.handlerPager(request);
			ResponseEntity<List<Provider>> entity = new ResponseEntity<List<Provider>>(providerService.get(queryMap, pager),HttpStatus.OK);
			//response.setHeader("total", String.valueOf(pager.getRowsCount()));
			return entity;
		}
    }
	
}