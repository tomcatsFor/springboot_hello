package com.qf.demo.controller;

import com.qf.demo.entity.TUser;
import com.qf.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;


    @GetMapping("getById/{id}")
    public TUser getById(@PathVariable("id") Integer id){
        return userService.selectByPrimaryKey(id);
    }
    @GetMapping("addUser")
    public String addUser(@Valid TUser user){
        System.out.println(user);
        return "addUser";
    }
}
