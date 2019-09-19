package com.thinrain.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.thinrain.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/user")
    public String user() {
        System.out.println("user...");
        return "user";
    }

    @RequestMapping("/getStringParam")
    @ResponseBody
    public String getStringParam(String userName, String age) {
        System.out.println(userName + "," + age);
        return "welcome!" + userName + "," + age;
    }

    @RequestMapping("/getObjectParam")
    @ResponseBody
    public String getObjectParam(User user) {
        System.out.println(user.getUserName() + "," + user.getAge());
        return "welcome!" + user.getUserName() + "," + user.getAge();
    }

    @RequestMapping("/getObjectsParam")
    @ResponseBody
    public String getObjectsParam(User user) {
        System.out.println("name:" + user.getUserName() + " age:" + user.getAge() + " card:" + user.getCard());
        return "welcome!" + user.getUserName() + "," + user.getAge() + " card:" + user.getCard();
    }

    @PostMapping(value = "/getJsonParam", consumes = {"application/json"})
    @ResponseBody
    public String getJsonParam(@RequestBody User user) {

        return "welcome!" + user.getUserName() + user.getAge();
    }
}
