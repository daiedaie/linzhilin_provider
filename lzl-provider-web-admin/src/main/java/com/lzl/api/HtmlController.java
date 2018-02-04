package com.lzl.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzl.api.controller.BaseController;


/**
* 描述：前端入口
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:16
*/
@Controller
@RequestMapping(value = "/")
public class HtmlController extends BaseController  {


	@RequestMapping()
    public String html(HttpServletRequest request) throws Exception {
		return "index";
    }
	
//	@RequestMapping("/login")
//    public String login(HttpServletRequest request) throws Exception {
//		return "index";
//    }

}