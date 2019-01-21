package com.xzlx.web.api.web.interceptor;

import com.xzlx.commons.util.MapperUtils;
import com.xzlx.commons.util.dto.BaseResult;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IsLogin implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        String method = httpServletRequest.getMethod();
        if(!method.equals("GET")&&httpServletRequest.getSession().getAttribute("user")==null){
            BaseResult baseResult=BaseResult.fail(401,"该操作需要登录后才可使用");
            String json = MapperUtils.obj2json(baseResult);
            httpServletResponse.getWriter().append(json);
            return false;
        }else
             return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
