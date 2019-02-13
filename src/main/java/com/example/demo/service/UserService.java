package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/2/13 09:42
 * @Description:
 */
public interface UserService {

    List<User> findAllUser();

    int addUser(User user);

    void test();

    User selectByPrimaryKey(Integer id);

}
