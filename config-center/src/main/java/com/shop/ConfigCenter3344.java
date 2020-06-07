package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Ymino on 2020/6/7.
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigCenter3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter3344.class, args);
        System.out.println("==================ConfigCenterMain3344 启动成功");
    }
}
