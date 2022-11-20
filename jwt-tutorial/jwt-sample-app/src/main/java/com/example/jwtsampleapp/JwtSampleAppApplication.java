package com.example.jwtsampleapp;

import com.example.jwtsampleapp.domain.Role;
import com.example.jwtsampleapp.domain.UserInfo;
import com.example.jwtsampleapp.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class JwtSampleAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtSampleAppApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        // run the following after the service initializes
        return args -> {

            // create roles
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            // create users
            userService.saveUser(new UserInfo(null, "John Doe", "john", "1234", new ArrayList<>()));
            userService.saveUser(new UserInfo(null, "Will Smith", "will", "1234", new ArrayList<>()));
            userService.saveUser(new UserInfo(null, "Abuchi Doe", "abuchi", "1234", new ArrayList<>()));

            // add role to user
            userService.addRoleToUser("john", "ROLE_USER");
            userService.addRoleToUser("john", "ROLE_MANAGER");
            userService.addRoleToUser("will", "ROLE_ADMIN");
            userService.addRoleToUser("abuchi", "ROLE_SUPER_ADMIN");
        };
    }

}
