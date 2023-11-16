package com.sample.springboot_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldControlller {
	@GetMapping("/world")
    public String helloWorld() {
        return "Hello, Arafath Beevi SAG";
	}
}
