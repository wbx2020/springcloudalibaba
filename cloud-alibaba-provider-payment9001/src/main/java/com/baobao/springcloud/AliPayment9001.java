package com.baobao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-08-17 20:53
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AliPayment9001 {
    public static void main(String[] args) {
        SpringApplication.run(AliPayment9001.class, args);
    }
}
