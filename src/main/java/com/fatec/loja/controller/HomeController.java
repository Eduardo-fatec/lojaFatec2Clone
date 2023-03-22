package com.fatec.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/perfumaria")
    public String perfumaria(){
        return "perfumaria";
    }

    @GetMapping("/hortifruti")
    public String hortifruti(){
        return "hortifruti";
    }

    @GetMapping("/roupa")
    public String roupa(){
        return "roupa";
    }

    @GetMapping("/suplemento")
    public String suplemento(){
        return "suplemento";
    }
}

