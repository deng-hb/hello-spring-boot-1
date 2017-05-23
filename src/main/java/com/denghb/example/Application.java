package com.denghb.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello spring boot
 *
 * @author denghb
 */
@RestController
@EnableAutoConfiguration
public class Application {
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
