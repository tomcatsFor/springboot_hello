package com.qf.springboot_hello.controller;

import com.qf.springboot_hello.entity.Resource;
import com.qf.springboot_hello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("user")
public class userController {
    /*@Autowired
    private User user;*/

    @GetMapping("page")
    public String page(@RequestParam(name = "pageIndex",required = false,defaultValue = "1")Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping("page/{pageIndex}")
    public String pageRestful(@PathVariable (name = "pageIndex") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }
    @GetMapping("getUser")
    public User getUser(User user){
        /*Date date = new Date();
        user.setDate(date);*/
        return user;
    }
    @Autowired
    private Resource resource;
    /*@Value("${images.serverpath}")
    private String imageServer;*/
    @GetMapping("getImageServer")
    public String getImageServer(){
        System.out.println(resource.getImageServer());
        return "imageServer:"+resource.getImageServer()+
                "emailServer"+ resource.getEmailServer();
    }
}
