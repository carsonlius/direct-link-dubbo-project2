package com.carsonlius.dubbo.service.impl;

import com.carsonlius.dubbo.model.User;
import com.carsonlius.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("刘森");
        return user;
    }
}
