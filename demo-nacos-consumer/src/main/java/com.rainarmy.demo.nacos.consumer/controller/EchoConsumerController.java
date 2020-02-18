package com.rainarmy.demo.nacos.consumer.controller;

import com.rainarmy.demo.nacos.consumer.service.FeignProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * echoConsumerController
 * @author wangchengjun
 * @version V1.0
 * @date 2020/2/18 17:52
 */
@RequestMapping("/echo")
public class EchoConsumerController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignProviderService feignProviderService;

    @GetMapping("/loadBalancer/${name}")
    public String echoWithLoadBalancer(@PathVariable String name){
        ServiceInstance serviceInstance = loadBalancerClient.choose("demo-nacos-provider");
        String path = String.format("http://%s:%s/echo/%s",serviceInstance.getHost(),serviceInstance.getPort(),name);
        System.out.println("request path:" +path);
        return restTemplate.getForObject(path,String.class);
    }

    @GetMapping("/feign/${name}")
    public String echoWithFeign(@PathVariable String name){
        return feignProviderService.hello(" name");
    }
}
