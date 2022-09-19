package com.baobao.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.baobao.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-09-14 23:41
 */
@RestController
public class FlowLimitController {
    private final static String url = "http://localhost:8401/testC";

    @Autowired
    TestService testService;

    @GetMapping("/testA")
    public String testA()
    {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject(url, String.class);
        testService.common();
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB()
    {
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject(url, String.class);
        testService.common();
        return "------testB";
    }

    @GetMapping("/testC")
    @SentinelResource("testC")
    public String testC()
    {
        return "------testC";
    }
}
