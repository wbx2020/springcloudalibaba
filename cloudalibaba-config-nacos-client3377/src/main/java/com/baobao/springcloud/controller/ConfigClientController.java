package com.baobao.springcloud.controller;

import com.baobao.springcloud.config.NacosConfigTestConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-09-05 22:19
 */
@RestController
@RefreshScope
@Slf4j
public class ConfigClientController {
//    @Value("${config.info}")
//    private String configValue;
    @Autowired
    NacosConfigTestConfig nacosConfigTestConfig;

    @Value("${spring.profiles.active}")
    private String active;

    @GetMapping("/getConfigValue")
    public String getConfigValue() {
        log.info("active: {}", active);
        String info = nacosConfigTestConfig.getInfo();
        return info;
    }
}
