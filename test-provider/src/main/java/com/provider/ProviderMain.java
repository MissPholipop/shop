package com.provider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Ymino on 2020/6/3.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMain {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain.class, args);
        System.out.println("ProviderMain 启动成功!!!");
    }

}
