package com.example.fishfilms.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.Map;

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

    @GetMapping(path = "/profile")
    public String profilePage(@AuthenticationPrincipal OAuth2User user, Model model) {
        model.addAttribute("pic", user.getAttribute("picture"));
        model.addAttribute("name", user.getAttribute("name"));
        return "profile.html";
    }
}
