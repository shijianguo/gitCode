package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("this is spring boot starter");
        System.out.println("this is spring boot end");
        System.out.println("this is springBoot detail start");
        System.out.println("this is springBoot detail end");
        SpringApplication.run(DemoApplication.class, args);
    }

}
