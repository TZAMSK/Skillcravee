package com.stage.sprint3.controller;

import com.stage.sprint3.entities.Administration;
import com.stage.sprint3.entities.Entreprise;
import com.stage.sprint3.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    AdministrateurService adminService;
    @GetMapping("/administrateurs")
    public String afficherEtudiants(Model model){
        Iterable<Administration> listeAdmins = adminService.afficherAdmins();
        model.addAttribute("listeAdmins",listeAdmins);
        return "administrateurs";
    }

    @GetMapping("/administrateurs/delete/{id}")
    public String supprimerAdmin(@PathVariable(name = "id") Integer id, RedirectAttributes redirectAttributes){
        adminService.supprimer(id);
        redirectAttributes.addFlashAttribute("message", "L'administrateur ID " + id + " a été supprimé avec succès ");
        return "redirect:/administrateurs";
    }

    @GetMapping("rechercher/administrateurs")
    public String rechercherEntreprise(Model model, @Param("keyword") String keyword){
        List<Administration> listeAdmins = adminService.rechercherAdminParNom(keyword);
        model.addAttribute("listeAdmins", listeAdmins);
        model.addAttribute("keyword", keyword);
        return "administrateurs";
    }

}

