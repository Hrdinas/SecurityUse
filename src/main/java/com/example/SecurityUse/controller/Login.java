package com.example.SecurityUse.controller;

import com.example.SecurityUse.domain.User;
import com.example.SecurityUse.service.UserService;
import com.example.SecurityUse.tuils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
    @RequestMapping("/login")
public class Login {

@Autowired
private UserService userService;


    @PostMapping("/adminLogin")
    public CommonResult adminLogin(@RequestBody User user){

        return userService.adminLogin(user);
    }

}
