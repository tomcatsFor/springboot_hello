package com.qf.springboot_hello.config;

import com.qf.springboot_hello.filter.MyFilter;
import com.qf.springboot_hello.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Autowired
    private MyFilter myFilter;
    @Autowired
    private MyListener myListener;
    @Bean
    public FilterRegistrationBean initFilterRegisterBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        //此处如果是new出来的filter,那么就不属于spring管理
        filterRegistrationBean.setFilter(myFilter);
        filterRegistrationBean.setName("myFilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    public ServletListenerRegistrationBean initListener(){
        ServletListenerRegistrationBean listenerRegistrationBean = new ServletListenerRegistrationBean();
        listenerRegistrationBean.setListener(myListener);
        return  listenerRegistrationBean;
    }
}
