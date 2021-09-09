package com.example.laboratorio11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class Laboratorio11Application {

    public static void main(String[] args) {
        SpringApplication.run(Laboratorio11Application.class, args);
    }

}
