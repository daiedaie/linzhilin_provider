package com.lzl.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class UnauthController{

	@RequestMapping(value = "unauth")
    public ResponseEntity<Object> unauth(HttpServletRequest request) throws Exception {
		return new ResponseEntity<Object>(HttpStatus.FORBIDDEN);
    }
	
	@RequestMapping(value = "tologin")
    public ResponseEntity<Object> tologin(HttpServletRequest request) throws Exception {
        return new ResponseEntity<Object>(HttpStatus.FOUND);
    }

}
