package com.rainarmy.demo.dubbo.service.impl;

import com.rainarmy.demo.dubbo.service.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * EchoServiceImpl
 * @author wangchengjun
 * @version V1.0
 * @date 2020/2/19 16:52
 */
@Service
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String message) {
        return "echo hello " + message;
    }
}
