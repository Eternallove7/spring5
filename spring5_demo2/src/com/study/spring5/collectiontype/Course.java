package com.study.spring5.collectiontype;

import com.study.spring5.factorybean.MyBean;

/**
 * @author RenAshbell
 * @create 2022-05-02-15:48
 */
public class Course extends MyBean {
    private String cname;// 课程名称

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
