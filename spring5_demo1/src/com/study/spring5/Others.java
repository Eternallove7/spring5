package com.study.spring5.testdemo;

/**
 * @author RenAshbell
 * @create 2022-05-01-20:29
 */

/**
 * 使用有参构造注入
 */
public class Others {

    private String oname;
    private String address;

    // 有参构造
    public Others(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }
}
