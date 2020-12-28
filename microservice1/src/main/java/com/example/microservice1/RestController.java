package com.example.microservice1;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String hello(){
        return "microservice1";
    }
}
