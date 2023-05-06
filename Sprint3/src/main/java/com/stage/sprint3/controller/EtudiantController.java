package com.stage.sprint3.controller;

import com.stage.sprint3.entities.Etudiant;
import com.stage.sprint3.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class EtudiantController {

    @Autowired
    EtudiantService etudiantService;
    @GetMapping("/etudiants")
    public String afficherEtudiants(Model model){
        Iterable<Etudiant> listeEtudiants = etudiantService.afficherEtudiants();
        model.addAttribute("listeEtudiants",listeEtudiants);
        return "etudiants";
    }

    @GetMapping("/etudiants/delete/{id}")
    public String supprimerEtudiant(@PathVariable(name = "id") Integer id, RedirectAttributes redirectAttributes){
        etudiantService.supprimer(id);
        redirectAttributes.addFlashAttribute("message", "L'etudiant ID " + id + " a été supprimé avec succès ");
        return "redirect:/etudiants";
    }

    /*
    @GetMapping("/etudiant/new")
    public String afficherFormulaireEtudiant(Model model){
        Etudiant etudiant = new Etudiant();
        model.addAttribute("etudiant", etudiant);
        return "etudiant_form";
    }



    @PostMapping("/etudiant/save")
    public String ajouterEtudiant(Etudiant etudiant, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Le etudiant: "+ etudiant.getNom() +"a ete ajouter avec succes");
        service.ajouterEtudiant(etudiant);
        return "redirect:/index";
    }

     */

}
