package com.baobao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-09-01 22:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerNcosOrderMain83 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerNcosOrderMain83.class, args);
    }
}
