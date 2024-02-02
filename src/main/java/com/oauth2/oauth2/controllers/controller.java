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

    /**
     * Specific end point mentioned in <a href="https://spring.io/guides/tutorials/spring-boot-oauth2/#github-register-application">...</a> article explaining OAuth integration with Spring Boot
     *
     * @param principal handled totally from the framework
     * @return current authenticated user account data returned from github
     */
    @GetMapping("/user")
    public Map<String, OAuth2User> user(@AuthenticationPrincipal OAuth2User principal) {
        return Map.of("name", principal);
    }
}
