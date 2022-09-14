package com.baobao.springcloud.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: WenBaoXiang
 * @Date: 2022-09-06 20:53
 */
@Configuration
@ConfigurationProperties(prefix = "config")
@Data
public class NacosConfigTestConfig {
    private String info;
}
