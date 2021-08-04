package com.wwh.itoken.common.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 初始化常量拦截器
 * <p>Title: ConstantsInterceptor</p>
 * <p>Description: </p>
 *
 * @author William
 * @version 1.0.0
 * @date 2021/8/4 10:13
 */
public class ConstantsInterceptor implements HandlerInterceptor {
    private static final String HOST_CDN = "http://192.168.75.128:81";

    private static final String TEMPLATE_ADMIN_LTE = "adminlte/v2.4.3";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        if (modelAndView != null) {
            modelAndView.addObject("adminlte", HOST_CDN + "/" + TEMPLATE_ADMIN_LTE);
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }
}
