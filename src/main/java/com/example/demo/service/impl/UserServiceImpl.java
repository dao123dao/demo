package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.entity.UserExample;
import com.example.demo.mapper.LogMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/2/13 09:46
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LogMapper logMapper;


    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void test() {
        userMapper.delete();

        User u = new User();
        u.setUsername("唐武林");
        u.setSex("1");
        userMapper.insert(u);

        User u2 = new User();
        u2.setUsername("谢谢");
        u2.setSex("1");
        userMapper.insert(u2);
    }

    @Override
    public List<User> findAllUser() {
        UserExample example = new UserExample();
        return userMapper.selectByExample(example);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return null;
    }
}
