package com.study.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;

/**
 * @author RenAshbell
 * @create 2022-05-02-15:56
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
