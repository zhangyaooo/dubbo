package com.mr.dubbodemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mr.dubbocommon.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DemoController
 * @Description: TODO
 * @Author: zy
 * @Create: 2020-08-22 15:25
 * @Version:1.0
 **/
@RestController
@RequestMapping("demo")
public class DemoController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("index")
    public String index(){
        return demoService.getDemoString();
    }

}
