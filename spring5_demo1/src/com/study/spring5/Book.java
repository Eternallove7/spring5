package com.study.spring5;

/**
 * @author RenAshbell
 * @create 2022-05-01-17:34
 */
public class Book {

    private String bname;
    private String bauthor;
    private String address;

    // set方法注入
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
