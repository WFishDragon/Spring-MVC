package com.wyl.controller;

import com.wyl.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloHandler {
    //基础用法
    @RequestMapping("/index")
    public String index(){
        System.out.println("接收到请求");
        return "index";
    }
    //pojo数据绑定
    @PostMapping("/add")
    public String add(User user){
        System.out.println(user);
        return "index";
    }
    //model视图用法
    @RequestMapping("/model")
    public String model(Model model){
        User user = new User();
        user.setId(10);
        user.setName("埃索达网");
        model.addAttribute("user",user);
        System.out.println(model);
        return "model";
    }
    //modelAndView视图用法
    @RequestMapping("/mv1")
    public ModelAndView modelAndView(){
        ModelAndView view = new ModelAndView();
        User user = new User();
        user.setId(11);
        user.setName("形成的");
        view.addObject("user",user);
        view.setViewName("model");
        System.out.println(view);
        return view;
    }
    //servlet请求
    @RequestMapping("/servlet")
    public String request(HttpServletRequest request){
        User user = new User();
        user.setId(10);
        user.setName("阿斯顿我给");
        request.setAttribute("user",user);
        System.out.println(request);
        return "model";
    }
        //HiddenHttpMethodFilter的实现
        //    @RequestMapping(value = "/find",method = RequestMethod.GET)
        @GetMapping("/find")
        @ResponseBody
        public String find(){
            return "Hello";
        }
        @PostMapping("/save")
        public void save(){

        }
        @PutMapping("/update")
        @ResponseBody
        public String update(){
            return "已接收到PUT请求";
        }
        @DeleteMapping("/delete")
        public void delete(){

        }
}


