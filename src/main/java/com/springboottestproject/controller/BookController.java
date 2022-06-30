package com.springboottestproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getId(){
        System.out.println("springboot running.....2");
        System.out.println("push test");
        System.out.println("pull test");
        return "springboot running......2";
    }
}
