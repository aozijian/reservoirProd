package com.nit.reservoir.service.interceptor;

import com.nit.reservoir.core.contants.Constants;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆拦截器
 * Created by aozijian on 2017-05-15.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        boolean flag = false;
        if (handler instanceof HandlerMethod) {
            HandlerMethod method = (HandlerMethod) handler;
            if (null != method) {
                Access access = method.getMethodAnnotation(Access.class);
                if (access != null) {
                    boolean login = access.login();

                    if (!login)
                        flag = true;
                }
            }

        }

        if (flag == false) {
            HttpSession session = request.getSession();
            if (null != session && session.getAttribute(Constants.GLOBAL_USER) != null) {
                flag = true;
            }else {
                response.sendRedirect( request.getContextPath()+"/login");
            }

        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }
}
