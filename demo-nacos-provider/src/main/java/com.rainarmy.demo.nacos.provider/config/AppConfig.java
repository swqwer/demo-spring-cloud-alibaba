package com.rainarmy.demo.nacos.provider.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * config
 * @author wangchengjun
 * @version V1.0
 * @date 2020/2/18 17:31
 */
@Configuration
@Data
public class AppConfig {
    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String appName;
}
