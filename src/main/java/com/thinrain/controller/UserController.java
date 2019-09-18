package com.thinrain.controller;

import com.thinrain.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/user")
    public String user() {
        System.out.println("user...");
        return "/WEB-INF/jsp/user.jsp";
    }

    //        /getStringParam?userName=zhangsan&age=13
    @RequestMapping("/getStringParam")
    @ResponseBody
    public String getStringParam(String userName, String age) {
        System.out.println(userName + "," + age);
        return "welcome!" + userName + "," + age;
    }

    //        /getObjectParam?name=lisi&age=14
    @RequestMapping("/getObjectParam")
    @ResponseBody
    public String getSObjectParam(User user) {
        System.out.println(user.getName() + "," + user.getAge());
        return "welcome!" + user.getName() + "," + user.getAge();
    }

    //        /getObjectsParam?name=lisi&age=14&card.cardNo=666
    @RequestMapping("/getObjectsParam")
    @ResponseBody
    public String getSObjectsParam(User user) {
        System.out.println("name:" + user.getName() + " age:" + user.getAge()+" card:"+user.getCard());
        return "welcome!" + user.getName() + "," + user.getAge();
    }
}
