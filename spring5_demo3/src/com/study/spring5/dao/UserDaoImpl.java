package com.study.spring5.dao;

import org.springframework.stereotype.Repository;

import javax.xml.ws.RespectBinding;

/**
 * @author RenAshbell
 * @create 2022-05-02-20:24
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add...");
    }
}
