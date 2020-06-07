package com.provider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Ymino on 2020/6/3.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMain7008 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain7008.class, args);
        System.out.println("ProviderMain80007 启动成功!!!");
    }

}
