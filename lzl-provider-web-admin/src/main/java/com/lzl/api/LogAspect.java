package com.lzl.api;

import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.lzl.common.ConstantsEJS;
import com.lzl.exception.BusinessException;
import com.lzl.util.JacksonUtil;

/** 
 *  
* @ClassName: LogAspect  
* @Description: 日志记录AOP实现  
* @author  
* @date 2016年05月3日 下午1:51:59  
* 
 */
@Aspect
@Component  
public class LogAspect {
    private final Logger        logger          = LogManager.getLogger(this.getClass());
    
    public static final String MEMBERID = "MEMBERID";
    
    public static final String QUERYMAP = "QUERYMAP";

    ThreadLocal<Long> startTime  = new ThreadLocal<Long>();
    
    @Pointcut("execution(* com.lzl.api.controller..*.*(..))")
    public void webLog(){}
    
    @SuppressWarnings("unchecked")
    @Around("webLog()")
    public Object aroundLog(ProceedingJoinPoint joinpoint) {
        ResponseEntity<Object> result = null;
        try {
            
            long startTime = System.currentTimeMillis();
            
            RequestAttributes ra = RequestContextHolder.getRequestAttributes();
            ServletRequestAttributes sra = (ServletRequestAttributes) ra;
            HttpServletRequest request = sra.getRequest();
            
            //获取请求地址  
            String requestPath = request.getRequestURI();
            //请求方式
            String requestMethod = request.getMethod();
            //ip
            String ip = getIpAddr(request);
            //请求参数
            Map<String, Object> queryMap = getRequestParameters(request);
            String parameterStr= "GET".equals(requestMethod)?queryMap.toString():args2String(joinpoint);

            request.setAttribute(QUERYMAP, queryMap);

            //方法执行
            try {
                result = (ResponseEntity<Object>) joinpoint.proceed();
            } catch (BusinessException e) {
            	logger.error(e);
                logger.error(requestMethod + " mobile：" + queryMap.get("MOBILE") + " url："+ requestPath + " ip: " + ip + "  "+ (System.currentTimeMillis() - startTime) + "ms ;" + "\n" + parameterStr);
                return dealException(e.getMessage());
            } catch (Exception e) {
            	logger.error(e);
                logger.error(requestMethod + " mobile：" + queryMap.get("MOBILE") + " url："+ requestPath + " ip: " + ip + "  "+ (System.currentTimeMillis() - startTime) + "ms ;" + "\n" + parameterStr);
                return dealException(ConstantsEJS.SERVICE_RESULT_EXCEPTION_SYSERROR);
            }

            logger.debug("************* : " + result.getBody());
            logger.info(requestMethod + " mobile：" + queryMap.get("MOBILE") + " url："+ requestPath + " ip: " + ip + "  "+ (System.currentTimeMillis() - startTime) + "ms ;" + "\n" + parameterStr);
            
            //判断get请求返回数据是否为空
            if ("GET".equals(request.getMethod()) && result.getStatusCodeValue()!=HttpStatus.FORBIDDEN.value() && result.getStatusCodeValue()!=HttpStatus.FOUND.value()) {
                Object object = result.getBody();
                if (object instanceof List) {
                    if (((List<?>) object).size() == 0) {
                        return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
                    }
                } else if (object == null) {
                    return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
                }
            }

            return result;
        } catch (Throwable t) {
            logger.error(t.getMessage());
            return dealException(ConstantsEJS.SERVICE_RESULT_EXCEPTION_SYSERROR);
        }
    }
    
    private ResponseEntity<Object> dealException(String msg){
        HttpHeaders headers = new HttpHeaders();
        MediaType mediaType = new MediaType("text","html",Charset.forName("utf-8"));
        headers.setContentType(mediaType);
        return new ResponseEntity<Object>(msg,headers,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    /** 
     * 获取request中get参数 
     * @param request 页面请求 
     */
    @SuppressWarnings("deprecation")
    private Map<String, Object> getRequestParameters(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        String parameters = "";//请求参数  
        if ("GET".equals(request.getMethod())) {//GET请求时的参数  
            parameters = request.getQueryString();//网址中的参数  
            if (!StringUtils.isEmpty(parameters)) {
                String[] arr = parameters.split("&");
                for (int i = 0; i < arr.length; i++) {
                    String key = arr[i].substring(0, arr[i].indexOf("="));
                    String value = arr[i].substring(arr[i].indexOf("=") + 1);
                    map.put(key, URLDecoder.decode(value));
                }
            }
        }
        return map;
    }
    
    /**
     * 获取非get请求的参数
     * @param paramsArray
     * @return
     */
    private String args2String(ProceedingJoinPoint joinpoint) throws Exception {
        Object[] paramsArray = joinpoint.getArgs();
        String params = "";
        if (paramsArray != null && paramsArray.length > 0) {
            for (int i = 0; i < paramsArray.length; i++) {
                Object obj = paramsArray[i];
                if(obj == null || obj instanceof HttpServletRequest || obj instanceof HttpServletResponse || obj instanceof MultipartFile){
                    continue;
                }
                params += JacksonUtil.obj2json(obj);
            }
        }
        return params.trim();
    }
    
    /**
     * 获取登录用户远程主机ip地址
     * 
     * @param request
     * @return
     */
    private String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}