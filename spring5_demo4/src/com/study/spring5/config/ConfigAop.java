package com.study.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author RenAshbell
 * @create 2022-05-03-22:26
 */
@Configuration
@ComponentScan(basePackages = {"com.study"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
