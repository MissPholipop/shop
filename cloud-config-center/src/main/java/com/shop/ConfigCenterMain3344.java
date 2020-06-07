package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @function:
 * @author: create by Alfred.Wong
 * @date: 2020/4/8 15:47
 * @version: v1.0
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
        System.out.println("==================ConfigCenterMain3344 启动成功");
    }
}
