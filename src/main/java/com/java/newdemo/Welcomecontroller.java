package com.java.newdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcomecontroller {


    @GetMapping("/welcome")
    public String welcome(){
        return  "Welcome to springboot new app!!";

    }



}
