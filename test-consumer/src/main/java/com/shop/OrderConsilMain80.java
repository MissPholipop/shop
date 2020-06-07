package com.shop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Ymino on 2020/6/3.
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class OrderConsilMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsilMain80.class, args);
        System.out.println("OrderConsilMain80 启动成功!!!");
    }
}


