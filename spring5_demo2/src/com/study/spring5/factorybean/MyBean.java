package com.study.spring5.factorybean;

import com.study.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author RenAshbell
 * @create 2022-05-02-16:13
 */
public class MyBean implements FactoryBean<Course>{
    // 定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
