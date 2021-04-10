package com.example.fishfilms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(path = "/films")
    public String filmPage(){
        return "films.html";
    }

    @GetMapping(path = "/directors")
    public String directorsPage(){
        return "directors.html";
    }

    @GetMapping(path = "/login")
    public String loginPage(){
        return "login.html";
    }
}
