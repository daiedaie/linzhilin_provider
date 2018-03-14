package com.lzl.api.controller.refund;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.refund.Refund;
import com.lzl.common.Pager;
import com.lzl.service.refund.IRefundService;
import com.lzl.util.WebUtil;

import io.swagger.annotations.ApiOperation;


/**
* 描述：Refund控制层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-27 16:06:31
*/
@RestController
@RequestMapping(value = "/refund")
public class RefundController extends BaseController  {

    @Autowired
    private IRefundService refundService;

	@SuppressWarnings("unchecked")
    @ApiOperation(value="列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Object> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("=========进入refundController===========");
		Pager pager = WebUtil.handlerPager(request);
		ResponseEntity<Object> entity = new ResponseEntity<Object>(refundService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),pager),HttpStatus.OK);
		response.setHeader("total", String.valueOf(pager.getRowsCount()));
		System.out.println("===========refund 查询到的  entity:" + entity);
		return entity;
    }
	
	@ApiOperation(value="更新", notes="必传：refundId ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody Refund refund) throws Exception {
		refundService.put(refund);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/down",method = { RequestMethod.GET })
    public ResponseEntity<Object> down(HttpServletRequest request,HttpServletResponse response) throws Exception {
        // 下载文件的默认名称
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("退款退货信息","UTF-8") + ".xls");
        List<Refund> list = refundService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),null);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateStr = sdf.format(new Date());
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("退款退货详细信息——" + dateStr, "退款退货信息"), Refund.class, list);

        workbook.write(response.getOutputStream());
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}