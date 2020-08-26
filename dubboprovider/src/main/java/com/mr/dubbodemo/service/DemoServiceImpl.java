package com.mr.dubbodemo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mr.dubbocommon.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @ClassName: DemoServiceImpl
 * @Description: TODO
 * @Author: zy
 * @Create: 2020-08-22 15:07
 * @Version:1.0
 **/
@Component
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Override
    public String getDemoString() {
        return "Hello Dubbo!";
    }
}

