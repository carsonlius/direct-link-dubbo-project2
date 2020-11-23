package com.carsonlius.dubbo.service.impl;

import com.carsonlius.dubbo.model.User;
import com.carsonlius.dubbo.service.UserService;

public class UserServiceImpl2 implements UserService {
    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("version = 2.0.0");
        return user;
    }
}
