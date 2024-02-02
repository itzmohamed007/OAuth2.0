package com.oauth2.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/", "/error", "/home").permitAll(); // permitting standard routes for all users
                    auth.anyRequest().authenticated(); // limiting access to other routes like /user and /home/secured
                })
                .formLogin(Customizer.withDefaults()) // generating a default login form
                .build();

    }
}
