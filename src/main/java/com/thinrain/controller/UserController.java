package com.thinrain.controller;

import com.thinrain.pojo.Card;
import com.thinrain.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String user() {
        System.out.println("user...");
//        return "user";
//        return "hello"; //服务器内部转发
        return "redirect:hello";//客户端重定向
    }

    @RequestMapping("/getStringParam")
    @ResponseBody
    public String getStringParam(String userName, Integer age) {
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

    @RequestMapping("/getJsonParam")
    @ResponseBody
    public String getJsonParam(@RequestBody User user) {
        System.out.println("name:" + user.getUserName() + " age:" + user.getAge() + " card:" + user.getCard());
        return "welcome!" + user.getUserName() + "," + user.getAge() + " card:" + user.getCard();
    }

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = new User();
        user.setUserName("丁不四");
        user.setAge(34);
        Card card = new Card();
        card.setCardNo(99);
        user.setCard(card);
        System.out.println("getUserInfo");
        return user;
    }

    @RequestMapping("/getUserList")
    @ResponseBody
    public List<User> getUserList() {
        List<User> list = new ArrayList<>();

        User user = new User();
        user.setUserName("Tom");
        user.setAge(34);
        Card card = new Card();
        card.setCardNo(99);
        user.setCard(card);

        list.add(user);

        System.out.println("getUserList");
        return list;
    }

}
