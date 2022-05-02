package com.study.spring5.service;

import com.study.spring5.dao.UserDao;
import com.study.spring5.dao.UserDaoImpl;

/**
 * @author RenAshbell
 * @create 2022-05-01-21:01
 */
public class UserService {

    // 创建UserDao类型属性, 生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add....");
        userDao.update();
    }
}
