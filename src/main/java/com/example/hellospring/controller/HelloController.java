package com.example.hellospring.controller;

import com.example.hellospring.service.FridayCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/firstmapping")
    public String firstMapping(){
        return "Hello World!";
    }

    @GetMapping("/")
    public String rootMapping(){
        return "Default Page!";
    }

    @GetMapping("/parameter")
    public String paramter(@RequestParam String inddata){
        return inddata + " er dagens tekst";
    }

    @GetMapping("/erdetfredag")
    public String erdetfredag(){
        FridayCalculator fridayCalculator = new FridayCalculator();
        return fridayCalculator.erdetfredag();
    }

}
