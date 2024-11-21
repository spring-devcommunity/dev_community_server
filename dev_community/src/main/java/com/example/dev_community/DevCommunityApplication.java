package com.example.dev_community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DevCommunityApplication {
    public static void main(String[] args) {
        SpringApplication.run(DevCommunityApplication.class, args);
    }
}
