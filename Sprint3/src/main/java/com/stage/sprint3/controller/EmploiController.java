package com.stage.sprint3.controller;

import com.stage.sprint3.entities.Emploi;
import com.stage.sprint3.entities.Entreprise;
import com.stage.sprint3.entities.Prof;
import com.stage.sprint3.service.EmploiService;
import com.stage.sprint3.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class EmploiController {
    @Autowired
    EmploiService emploiService;
    @Autowired
    EntrepriseService incService;
    @GetMapping("")
    public String afficherEmplois(Model model) {
        Iterable<Emploi> listeEmplois = emploiService.afficherEmplois();
        model.addAttribute("listeEmplois", listeEmplois);
        return "index";
    }

    @GetMapping("rechercher/index")
    public String rechercherEmploi(Model model, @Param("keyword") String keyword){
        List<Emploi> listeEmplois = emploiService.rechercherEmploiParTitre(keyword);
        model.addAttribute("listeEmplois", listeEmplois);
        model.addAttribute("keyword", keyword);
        return "index";
    }

    @GetMapping("/emplois_entreprise/delete/{id}")
    public String supprimerEntreprise(@PathVariable(name = "id") Integer id, RedirectAttributes redirectAttributes){
        emploiService.supprimer(id);
        redirectAttributes.addFlashAttribute("message", "L'emploi ID " + id + " de l'entrepise a été supprimé avec succès ");
        return "redirect:/entreprises";
    }

}
