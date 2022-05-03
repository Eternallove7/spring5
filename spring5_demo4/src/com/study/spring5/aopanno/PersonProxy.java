package com.study.spring5.aopanno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author RenAshbell
 * @create 2022-05-03-22:07
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
    // 前置通知
    // @Before注解表示作为前置通知
    @Before(value = "execution(* com.study.spring5.aopanno.User.add(..))")
    public void before(){
        System.out.println("Person before...");
    }
}
