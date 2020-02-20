package com.rainarmy.demo.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * DubboProviderApplication
 * @author wangchengjun
 * @version V1.0
 * @date 2020/2/20 15:07
 */
@EnableDiscoveryClient
@EnableAutoConfiguration
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class,args);
    }
}
