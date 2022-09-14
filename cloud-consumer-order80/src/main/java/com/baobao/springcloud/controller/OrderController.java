package com.baobao.springcloud.controller;


import cloud.baobao.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-08-03 22:14
 */
@RestController
@Slf4j
@RequestMapping("/api/v1/order")
public class OrderController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/comsumer/payment/create")
    public CommonResult create(String serial) {
        String url = PAYMENT_URL + "/api/v1/payment/create?serial=" + serial;
        CommonResult commonResult = restTemplate.postForObject(url, serial, CommonResult.class);
        return commonResult;
    }
}
