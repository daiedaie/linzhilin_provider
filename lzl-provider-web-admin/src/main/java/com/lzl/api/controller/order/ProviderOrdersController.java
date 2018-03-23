package com.lzl.api.controller.order;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.order.ProviderOrders;
import com.lzl.common.Pager;
import com.lzl.service.order.IProviderOrdersService;
import com.lzl.util.WebUtil;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/providerOrders")
public class ProviderOrdersController extends BaseController {

	private final Logger logger = LogManager.getLogger(this.getClass());
	
	@Resource
	private IProviderOrdersService providerOrdersService;

	@ApiOperation(value="供应商订单列表", notes="必传： ；选传：page,size")
	@RequestMapping(method={ RequestMethod.GET })
	public ResponseEntity<List<ProviderOrders>> get(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Pager pager = WebUtil.handlerPager(request);
		@SuppressWarnings("unchecked")
		ResponseEntity<List<ProviderOrders>> entity = new ResponseEntity<List<ProviderOrders>>(providerOrdersService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		return entity;

	}
	@ApiOperation(value="供应商订单列表更新", notes="必传：repositoryId ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody ProviderOrders providerOrders) throws Exception {
		providerOrdersService.put(providerOrders);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }
	
	@ApiOperation(value="供应商订单列表新增", notes="必传： ；选传：")
	@RequestMapping(method = { RequestMethod.POST })
	public ResponseEntity<Object> post(HttpServletRequest request,@RequestBody ProviderOrders providerOrders) throws Exception {
		providerOrdersService.post(providerOrders);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/down",method = { RequestMethod.GET })
    public void down(HttpServletRequest request,HttpServletResponse response) throws Exception {
        // 下载文件的默认名称
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("订单数据","UTF-8") + ".xls");
        long start = new Date().getTime();
        List<ProviderOrders> list = providerOrdersService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),null);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateStr = sdf.format(new Date());
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("供应商订单详情——" + dateStr, "订单详情"), ProviderOrders.class, list);
        logger.info("*********************************订单数据导出耗时： " + ((new Date().getTime()-start)/1000) + " 秒");
        workbook.write(response.getOutputStream());
    }
}
