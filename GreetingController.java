package com.michael.springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableAutoConfiguration
public class GreetingController {

    @GetMapping("/home")
    public String sayHello() {
    return "index";

    }
}
