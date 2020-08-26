package com.mr.dubbodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboproviderApplication.class, args);
    }

}
