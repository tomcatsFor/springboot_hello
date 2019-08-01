package com.qf.demo.controller;

import com.qf.demo.entity.TUser;
import com.qf.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("page")
//@ResponseBody是返回一个请求体，不能用在视图解析器上
public class PageController {
    @Autowired
    private IUserService userService;
    @RequestMapping("index")
    public String hello(Model model){
        //制作异常
        int i = 1/0;
        Integer age = 20;
        //视图解析器解析
        String username = "马化腾";
        model.addAttribute("username", username);
        model.addAttribute("age", age);
        return "hello";
    }
    @GetMapping("getUsers")
    public String getUsers(Model model){
        List<TUser> userList = userService.getUsers();
        Date date = new Date();
        model.addAttribute("userList",userList);
        model.addAttribute("date",date);
        return "user";
    }
    @GetMapping("toAdd")
    public String toAdd(){
        return "addUser";
    }

}
