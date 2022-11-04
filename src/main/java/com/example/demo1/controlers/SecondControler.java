package com.example.demo1.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Second/sec")
public class SecondControler {
    @GetMapping
    public String fun(){
        return "ssssss";
    }
}