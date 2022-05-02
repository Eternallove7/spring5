package com.study.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author RenAshbell
 * @create 2022-05-02-21:00
 */
@Configuration  // 作为配置类, 替代xml配置文件
@ComponentScan(basePackages = {"com.study"})
public class SpringConfig {

}
