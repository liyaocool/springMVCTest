package com.thinrain.controller;

import com.thinrain.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/user")
    @ResponseBody
    public String userCtrl(User user) {
        System.out.println("user...");
        user.setName("张三");
        user.setAge(18);
        return "spring,zhang san";
    }

}
