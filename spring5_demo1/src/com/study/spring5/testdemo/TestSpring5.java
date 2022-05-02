package com.study.spring5.testdemo;

import com.study.spring5.Book;
import com.study.spring5.Others;
import com.study.spring5.User;
import org.aspectj.weaver.ast.Or;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RenAshbell
 * @create 2022-05-01-16:27
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2.获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2.获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void testOrders(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2.获取配置创建的对象
        Others others= context.getBean("orders", Others.class);
        System.out.println(others);
    }
}
