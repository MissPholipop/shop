package com.shop.service;


import com.shop.entities.CommonResult;
import com.shop.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @function:
 * @author: create by Alfred.Wong
 * @date: 2020/4/6 22:32
 * @version: v1.0
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVEICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/consul")
    public String paymentFeignTimeout();
}
