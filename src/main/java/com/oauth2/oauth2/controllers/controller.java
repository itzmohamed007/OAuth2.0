package com.oauth2.oauth2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/home")
    public String home() {
        return "hello world";
    }

    @GetMapping("/home/secured")
    public String securedHome() {
        return "hello secured world";
    }
}
