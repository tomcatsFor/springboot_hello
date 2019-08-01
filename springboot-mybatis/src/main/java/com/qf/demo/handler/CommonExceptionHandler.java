package com.qf.demo.handler;

import com.qf.demo.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean<String> handleException(Exception e){
        return new ResultBean("404","您的操作有误，请稍后再试...");
    }
}
