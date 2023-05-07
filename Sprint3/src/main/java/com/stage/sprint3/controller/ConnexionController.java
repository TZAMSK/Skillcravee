package com.stage.sprint3.controller;

import com.stage.sprint3.repos.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConnexionController {
    @Autowired
    EtudiantRepository etudiantRepository;

//    @PostMapping("/login")
//    public String login(@RequestParam String email, String password){
//        retrun'';
//    }
}
