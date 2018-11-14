package com.ticolago.cubanosensanantonio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class users {
    @GetMapping("/home")
    public String welcome() {
        return "home";
    }
}