package com.wyl.controller;

import com.wyl.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloHandler {

    @RequestMapping("/index")
    public String index(){
        System.out.println("接收到请求");
        return "index";
    }
    @PostMapping("/add")
    public String add(User user){
        System.out.println(user);
        return "index";
    }
}

