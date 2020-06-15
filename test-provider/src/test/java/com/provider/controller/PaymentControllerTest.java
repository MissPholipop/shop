package com.provider.controller;

import com.provider.BaseTest;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @Auther: Ting -- Iris
 * @Date: 2020/6/10
 */

public class PaymentControllerTest extends BaseTest {

    @Test
    public void paymentZKTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/payment/consul"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
