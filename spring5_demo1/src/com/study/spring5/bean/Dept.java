package com.study.spring5.bean;

/**
 * @author RenAshbell
 * @create 2022-05-01-21:19
 */
public class Dept {

    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return dname;
    }
}
