package com.vastika.um.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping ( "/login")
    public String getLoginForm() {
        return "login";
    }

    @GetMapping("/home")
    public String getHomePage(){
        return "home";
    }

    @GetMapping("/logout")
    public String logout(){
        return "login";
    }
}
