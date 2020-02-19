package com.rainarmy.demo.nacos.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * feignProviderService
 * @author wangchengjun
 * @version V1.0
 * @date 2020/2/18 18:11
 */
@FeignClient(value="demo-nacos-provider")
public interface FeignProviderService {
    @GetMapping(value = "hello/{name}")
    public String hello(@PathVariable String name);
}
