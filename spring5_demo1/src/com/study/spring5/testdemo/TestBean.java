package com.study.spring5.testdemo;

import com.study.spring5.bean.Emp;
import com.study.spring5.service.UserService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RenAshbell
 * @create 2022-05-01-21:10
 */
public class TestBean {

    @Test
    public void testBean1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testBean2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
    }
}
