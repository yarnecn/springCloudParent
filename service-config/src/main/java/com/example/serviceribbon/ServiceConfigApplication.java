package com.example.serviceribbon;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ServiceConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigApplication.class, args);
    }

    @Value("${port}")
    String foo;


    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}

