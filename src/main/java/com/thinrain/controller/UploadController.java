package com.thinrain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello...");
        return "hello";
    }

    @RequestMapping("/uploadfile")
    public String uploadfile() {
        System.out.println("uploadfile...");
        return "uploadfile";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file) {
        System.out.println(file.getOriginalFilename());
        return "ok";
    }

    @RequestMapping("/multiUpload")
    @ResponseBody
    public String multiUpload(MultipartFile[] file) {
        for (MultipartFile multipartFile :
                file) {
            System.out.println(multipartFile.getOriginalFilename());
        }
        return "ok";
    }
}
