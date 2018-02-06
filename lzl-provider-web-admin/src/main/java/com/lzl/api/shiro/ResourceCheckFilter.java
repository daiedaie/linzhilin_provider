package com.lzl.api.shiro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;

public class ResourceCheckFilter extends AccessControlFilter {
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response,
                                      Object mappedValue) throws Exception {
        Subject subject = getSubject(request, response);
        String url = getPathWithinApplication(request);
        System.out.println("前台请求的url : " + url);
        if (url != null) {
            if(url.endsWith("/")){
                // 截去url最后一个/
                url = url.substring(0, url.length() - 1);
            }
            if(url.startsWith("/")){
                // 截去url第一个/
                url = url.substring(1, url.length());
            }
            url = subStringNum(url);
        }
        String method = HttpMethodTransition.getInstance().getHttpMethodAction(request);
        
        url = url + ":" + method;
        
        System.out.println("*************************** "+url);
        System.out.println("=========subject.isPermitted(url)==========" + subject.isPermitted(url));
        System.out.println("==========subject.getPrincipal()============" + subject.getPrincipal());
        return subject.isAuthenticated() && subject.isPermitted(url);
    }
    
    
    /**
     * 判断是否是数字结尾，是的话将数字舍去（getById和delete的时候就可以通过请求了）
     * TODO : 再完善的的话是有数字全部替换成空字符串；
     * @param url
     * @return
     */
    private String subStringNum(String url){
        String[] urls = url.split("/");
        String numStr = "";
        if(urls.length > 1 ){
            numStr = urls[urls.length-1];
        }else{
            numStr = url;
        }
        Pattern pattern = Pattern.compile("[0-9]*");   
        Matcher isNum = pattern.matcher(numStr);  
        if( isNum.matches() ){ 
            url = url.replace(numStr, "");
        } 
        if(url.endsWith("/")){
            // 截去url最后一个/
            url = url.substring(0, url.length() - 1);
        }
        return url;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request,
                                     ServletResponse response) throws Exception {
        HttpServletResponse hsp = (HttpServletResponse) response;
        HttpServletRequest hReq = (HttpServletRequest) request;
        Subject subject = getSubject(request, response);
        if (!subject.isAuthenticated()) {
        	// 如果没有登录，去登录页
            //hsp.getWriter().print("<script>top.window.location.href='" + hReq.getContextPath() + "/login'</script>");
            hsp.sendRedirect(hReq.getContextPath() + "/tologin");
        } else {
            // 如果已登录，提示没有权限
            hsp.sendRedirect(hReq.getContextPath() + "/unauth");
        }
        return false;
    }

}

