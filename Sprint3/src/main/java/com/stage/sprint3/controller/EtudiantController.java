package com.stage.sprint3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class EtudiantController {
    @GetMapping("/etudiant/new")
    public String afficherFormulaireEtudiant(Model model){
        Etudiant etudiant = new etudiant();
        model.addAttribute("etudiant", etudiant);
        return "etudiant_form";
    }
    @PostMapping("/etudiant/save")
    public String ajouterEtudiant(Etudiant etudiant, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Le etudiant: "+ etudiant.getNom() +"a ete ajouter avec succes");
        service.ajouterEtudiant(etudiant);
        return "redirect:/index";
    }

}
