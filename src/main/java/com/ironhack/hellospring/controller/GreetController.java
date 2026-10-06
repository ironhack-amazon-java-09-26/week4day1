package com.ironhack.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

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

    @GetMapping("/hello/name/{name}")
    public String greetWithName(@PathVariable("name") String name) {
        System.out.println(LocalDateTime.now() + " - The value received for the variable name is: " + name);
        if(name.equalsIgnoreCase("ironhack")) {
            return "Hola al mejor grupo del mundo mundial!";
        }
        return "Hola " + name;
    }
}
