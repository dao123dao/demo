package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/2/13 09:33
 * @Description:
 */

@Api(description = "测试")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/findAllUser.json", method = RequestMethod.GET)
    private Object findAllUser() {
        List<User> userList = userService.findAllUser();
        return userList;
    }

    @RequestMapping(value = "/addUser.json", method = RequestMethod.POST)
    private Object addUser(@ApiParam(value = "用户") @RequestParam(required = false) User user) {
        return userService.addUser(user);
    }


}
