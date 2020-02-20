package com.rainarmy.demo.dubbo.controller;

import com.rainarmy.demo.dubbo.service.EchoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author wangchengjun
 * @version V1.0
 * @date 2020/2/20 23:58
 */
@RestController
public class EchoController {
    private EchoService echoService;
    @GetMapping("/echo/${message}")
    public String echo(@PathVariable String message) {
        return echoService.echo(message);
    }
}
