package com.oauth2.oauth2.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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
