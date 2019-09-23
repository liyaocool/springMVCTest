package com.thinrain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("my")
public class MyController {

    @RequestMapping("myInfo")
    @ResponseBody
    public String myInfo() {
        System.out.println("/my/myInfo...");
        int i = 1/0; //测试全局异常处理
        return "ok";
    }
}
