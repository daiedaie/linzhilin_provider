package com.lzl.api.controller.goods;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lzl.api.controller.BaseController;
import com.lzl.bean.javashop.goods.GoodsCate;
import com.lzl.common.Pager;
import com.lzl.service.goods.IGoodsCateService;
import com.lzl.util.MyProperties;
import com.lzl.util.UploadUtils;

import io.swagger.annotations.ApiOperation;


/**
* 描述：GoodsCate控制层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-13 13:34:06
*/
@RestController
@RequestMapping(value = "/goodsCate")
public class GoodsCateController extends BaseController  {

    @Autowired
    private IGoodsCateService goodsCateService;
    
    @Autowired
    private MyProperties myProperties;
	
    @SuppressWarnings("unchecked")
    @ApiOperation(value="列表", notes="必传： ；选传：page,size")
    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Object> get(HttpServletRequest request,HttpServletResponse response) throws Exception {
		ResponseEntity<Object> entity = new ResponseEntity<Object>(goodsCateService.get((Map<String, Object>) request.getAttribute("QUERYMAP"),new Pager()),HttpStatus.OK);
		return entity;
    }

	@ApiOperation(value="列表", notes="必传： ；选传：page,size")
	@RequestMapping(value="/getTopLevel", method = { RequestMethod.GET })
	public ResponseEntity<Object> getTopLevel(HttpServletRequest request,HttpServletResponse response) throws Exception {
		ResponseEntity<Object> entity = new ResponseEntity<Object>(goodsCateService.getTopLevel(),HttpStatus.OK);
		return entity;
	}
	
	@ApiOperation(value="更新", notes="必传：id ；选传：")
    @RequestMapping(method = { RequestMethod.PUT })
    public ResponseEntity<Object> put(HttpServletRequest request,@RequestBody GoodsCate goodsCate) throws Exception {
		goodsCateService.put(goodsCate);
		return new ResponseEntity<Object>(HttpStatus.OK);
    }
	
	@ApiOperation(value="新增", notes="必传：id ；选传：")
	@RequestMapping(method = { RequestMethod.POST })
	public ResponseEntity<Object> post(HttpServletRequest request,@RequestBody GoodsCate goodsCate) throws Exception {
		goodsCateService.post(goodsCate);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@ApiOperation(value="删除", notes="必传：id ；选传：")
	@RequestMapping(value="/{id}", method = { RequestMethod.DELETE })
	public ResponseEntity<Object> deleteById(HttpServletRequest request,@PathVariable("id") Integer id) throws Exception {
		goodsCateService.deleteById(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@RequestMapping(value = "/picUpload", method = { RequestMethod.POST })
    public ResponseEntity<Object> picUpload(@RequestParam("file") MultipartFile file) throws Exception {
        Map<String,Object> picMap = new HashMap<>();
        picMap.put("dic", myProperties.getImgBaseUrl() + "goods_cate");
        String[] originalFileName = file.getOriginalFilename().split("\\.");
        picMap.put("fileName", UUID.randomUUID().toString() + "." + originalFileName[1]);
        UploadUtils.getInstance().picUpload(file,picMap);
        System.out.println("图片上传成功：：：：：：：：：：：：：：：：：：：");
        return new ResponseEntity<Object>("goods_cate/"+picMap.get("fileName"),HttpStatus.OK);
    }
}