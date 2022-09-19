package com.baobao.springcloud.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-09-18 14:22
 */
//service.TestService
@Service
public class TestService {
    // 定义限流资源
    @SentinelResource("common")
    public String common(){
        System.out.println("common");
        return "common";
    }
}

