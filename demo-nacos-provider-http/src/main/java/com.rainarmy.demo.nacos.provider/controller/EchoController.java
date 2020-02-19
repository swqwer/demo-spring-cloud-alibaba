package com.rainarmy.demo.nacos.provider.controller;

import com.rainarmy.demo.nacos.provider.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * echoController
 * @author wangchengjun
 * @version V1.0
 * @date 2020/2/18 17:10
 */
@RestController
@RequestMapping("/echo")
public class EchoController {
    @Autowired
    private AppConfig config;

    @GetMapping(value = "hello/{name}")
    public String hello(@PathVariable String name){
        return String.format("hello %s i am from port %s",name,config.getPort());
    }
}
