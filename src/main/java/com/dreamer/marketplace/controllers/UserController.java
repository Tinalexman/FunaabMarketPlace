package com.dreamer.marketplace.controllers;

import com.dreamer.marketplace.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;


    @GetMapping("/user")
    public String getUser()
    {
        return "This is a user";
    }

}
