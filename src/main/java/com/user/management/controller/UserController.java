package com.user.management.controller;

import com.user.management.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @GetMapping("/users")
    public User getUserDetails() {
        return User.builder().id(101).name("Rajesh").age(27).build();
    }
}
