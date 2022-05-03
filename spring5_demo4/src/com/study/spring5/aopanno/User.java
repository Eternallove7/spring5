package com.study.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author RenAshbell
 * @create 2022-05-03-19:47
 */
// 被增强类
@Component
public class User {
    public void add(){
        System.out.println("add....");
    }
}
