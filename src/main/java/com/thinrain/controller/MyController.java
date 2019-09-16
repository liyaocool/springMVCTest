package com.thinrain.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("哇，这是第一个springMVC程序！");
        httpServletRequest.setAttribute("name", "张三");
        ModelAndView mv= new ModelAndView();
        mv.setViewName("/WEB-INF/hello.jsp");
        return null;
    }
}
