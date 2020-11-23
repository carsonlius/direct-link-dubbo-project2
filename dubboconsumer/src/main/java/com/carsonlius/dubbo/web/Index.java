package com.carsonlius.dubbo.web;

import com.carsonlius.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author carsonlius
 */
@RestController
public class Index {
    @Autowired
    private UserService userService;

    @GetMapping("user")
    public Object userDetail(Integer id){
        return userService.getUserById(id);
    }
}
