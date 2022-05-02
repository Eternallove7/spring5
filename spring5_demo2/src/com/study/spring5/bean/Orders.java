package com.study.spring5.bean;

/**
 * @author RenAshbell
 * @create 2022-05-02-16:38
 */
public class Orders {
    private String oname;

    public Orders() {
        System.out.println("第一步, 执行无参构造器创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步, 调用set方法设置属性值");
    }

    // 创建执行的初始化方法
    public void initMethod(){
        System.out.println("第三步, 执行初始化方法");
    }

    // 创建执行的销毁的方法
    public void destroyMethod(){
        System.out.println("第五步, 执行销毁的方法");
    }
}
