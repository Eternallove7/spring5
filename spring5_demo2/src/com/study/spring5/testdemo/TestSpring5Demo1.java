package com.study.spring5.testdemo;

import com.study.spring5.autowire.Emp;
import com.study.spring5.bean.Orders;
import com.study.spring5.collectiontype.Book;
import com.study.spring5.collectiontype.Course;
import com.study.spring5.collectiontype.Stu;
import com.study.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * @author RenAshbell
 * @create 2022-05-02-15:44
 */
public class TestSpring5Demo1 {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步, 获取创建bean实例对象");
        System.out.println(orders);

        // 手动让bean实例销毁
        context.close();
    }

    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
