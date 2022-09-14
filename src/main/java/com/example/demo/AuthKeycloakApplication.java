package com.example.demo;

import com.example.demo.config.KeyCloakConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class AuthKeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthKeycloakApplication.class, args);
	}

}
