package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.example.domain"})  // scan JPA entities
public class MozartAndMoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MozartAndMoreApplication.class, args);
    }

}
