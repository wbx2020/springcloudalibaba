package com.baobao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-08-17 8:49
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPaymentMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaPaymentMain9002.class, args);
    }
}
