package com.example.secure_microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class SecureMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecureMicroservicesApplication.class, args);
    }

}
