package com.stage.sprint3.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AccueilController {

    @GetMapping("")
    public String pageAccueil (){
        return "index";
    }
}
