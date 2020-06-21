package com.vkiprono.kafkaproducer.controllers;

import com.vkiprono.kafkaproducer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/publish/{name}")
    public String post(@PathVariable("name") final String name) {
         userService.publishString(name);
        return "Name Successfully Published";
    }
}
