package com.dangpham112000.springsecurity01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    // Config User Information
    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails admin = User.withUsername("admin").password("{noop}1234").roles("admin", "user").build();

        UserDetails user = User.withUsername("user").password("{noop}1234").roles("user").build();

        return new InMemoryUserDetailsManager(admin, user);
    }
}

