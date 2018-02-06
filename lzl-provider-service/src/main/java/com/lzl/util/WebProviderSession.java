package com.lzl.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.lzl.bean.javashop.ProviderUser;

/**
 * 平台Session管理
 *                       
 * @Filename: WebAdminSession.java
 * @Version: 1.0
 * @Author: 王朋
 * @Email: wpjava@163.com
 *
 */
public class WebProviderSession {

    public static final String SESSION_PROVIDER_USER = "SESSION_PROVIDER_USER";

    /**
     * 放入Session
     * @param request
     * @param adminUser
     */
    public static void putProviderUser(HttpServletRequest request, ProviderUser providerUser) {
        HttpSession session = request.getSession();
        session.setAttribute(SESSION_PROVIDER_USER, providerUser);
    }

    /**
     * 取得管理端Session
     * @param request
     * @return
     */
    public static ProviderUser getProviderUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        ProviderUser providerUser = (ProviderUser) session.getAttribute(SESSION_PROVIDER_USER);
        return providerUser;
    }
}
