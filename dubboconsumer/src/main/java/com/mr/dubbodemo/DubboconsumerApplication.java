package com.mr.dubbodemo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class DubboconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboconsumerApplication.class, args);
    }

}
