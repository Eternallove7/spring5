package com.study.spring5.service;

import com.study.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author RenAshbell
 * @create 2022-05-02-20:08
 */
// 注解里面value属性值可以省略不写
// 默认值是类名称, 首字母小写
//@Service(value = "userService") // 相当于<bean id="userService" class=".">
@Service
public class UserService {

    @Value(value = "abc")
    private String name;

    // 定义Dao类型属性
    // 不需要添加set方法
    // 添加属性注入注解

//    @Autowired  // 根据相同类型注入
//    @Qualifier(value = "userDaoImpl1") // 根据名称进行注入, 且要和Autowired一起使用
//    private UserDao userDao;

//    @Resource   // 根据类型进行注入
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    public void add(){
        System.out.println("service add..." + name);
        userDao.add();
    }
}
