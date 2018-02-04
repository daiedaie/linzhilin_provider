package com.lzl.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;

import com.lzl.common.Pager;


public class WebUtil {

    /**
     * 查询条件以  q_ 开头的参数取到
     * @param request
     * @return
     */
    public static Map<String, Object> getParamMapQ(HttpServletRequest request) {
        Map<String, String[]> params = request.getParameterMap();
        if (params == null)
            return null;
        Map<String, Object> queryMap = new HashMap<>();
        for (Map.Entry<String, String[]> entry : params.entrySet()) {
            if (entry.getValue() == null || entry.getValue().length <= 0)
                continue;
            //不考虑复选框多值情况，通常查询条件使用复选框为单值情况。
            if (entry.getKey().startsWith("q_") && entry.getValue().length == 1) {
                queryMap.put(entry.getKey().substring(2,entry.getKey().length()), entry.getValue()[0]);
            }
        }
        return queryMap;
    }

    /**
     * requeset所有参数
     * @param request
     * @return
     */
    public static Map<String, Object> getParamMap(HttpServletRequest request) {
        Map<String, String[]> params = request.getParameterMap();
        if (params == null)
            return null;
        Map<String, Object> queryMap = new HashMap<>();
        for (Map.Entry<String, String[]> entry : params.entrySet()) {
            if (entry.getValue() == null || entry.getValue().length <= 0)
                continue;
            queryMap.put(entry.getKey(), entry.getValue()[0]);
        }
        return queryMap;
    }
	
	 /**
     * 分页信息相关
     */
    public static Pager handlerPager(HttpServletRequest request) {
        try {
            int pageSize = StringUtils.isEmpty(request.getParameter("pageSize")) ? Pager.DEFAULT_PAGE_SIZE
                : Integer.parseInt(request.getParameter("pageSize"));
            int pageIndex = StringUtils.isEmpty(request.getParameter("pageIndex")) ? 1
                : Integer.parseInt(request.getParameter("pageIndex"));
			boolean isGetCount = StringUtils.isEmpty(request.getParameter("isGetCount")) ? false
                : Boolean.parseBoolean(request.getParameter("isGetCount"));
            return new Pager(pageSize, pageIndex,isGetCount);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 分页信息相关
     */
    @SuppressWarnings("unchecked")
    public static Pager handlerPager(HttpServletRequest request, Object map) {
        try {
            int pageSize = StringUtils.isEmpty(request.getParameter("pageSize")) ? Pager.DEFAULT_PAGE_SIZE
                : Integer.parseInt(request.getParameter("pageSize"));
            int pageIndex = StringUtils.isEmpty(request.getParameter("pageIndex")) ? 1
                : Integer.parseInt(request.getParameter("pageIndex"));
			boolean isGetCount = StringUtils.isEmpty(request.getParameter("isGetCount")) ? false
                : Boolean.parseBoolean(request.getParameter("isGetCount"));

            if (map instanceof ModelAndView) {
                ((ModelAndView) map).addObject("pageSize", pageSize);
                ((ModelAndView) map).addObject("pageIndex", pageIndex);
            } else if (map instanceof Model) {
                ((Model) map).addAttribute("pageSize", pageSize);
                ((Model) map).addAttribute("pageIndex", pageIndex);
            } else if (map instanceof ModelMap) {
                ((ModelMap) map).addAttribute("pageSize", pageSize);
                ((ModelMap) map).addAttribute("pageIndex", pageIndex);
            } else {
                ((Map<String, String>) map).put("pageSize", pageSize + "");
                ((Map<String, String>) map).put("pageIndex", pageIndex + "");
            }
            return new Pager(pageSize, pageIndex,isGetCount);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
