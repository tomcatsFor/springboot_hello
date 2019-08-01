package com.qf.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.demo.mapper")
@Slf4j
public class DemoApplication {

    public static void main(String[] args) {
        log.debug("调试级别的信息");
        log.info("普通级别的信息");
        log.warn("警告级别的信息");
        log.error("错误级别信息");
        SpringApplication.run(DemoApplication.class, args);
    }

}
