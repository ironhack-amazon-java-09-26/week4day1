package com.ironhack.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

    @GetMapping("/hello")
    public String greet() {
        return "Hola hola hola!";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Adiós adiós adiós!";
    }
}
