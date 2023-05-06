package com.stage.sprint3.controller;

import com.stage.sprint3.entities.Administration;
import com.stage.sprint3.entities.Emploi;
import com.stage.sprint3.entities.Entreprise;
import com.stage.sprint3.service.AdministrateurService;
import com.stage.sprint3.service.EntrepriseService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class EntrepriseController {
    @Autowired
    EntrepriseService incService;
    @GetMapping("/entreprises")
    public String afficherEntreprises(Model model){
        Iterable<Entreprise> listeEntreprises = incService.afficherEntreprises();
        model.addAttribute("listeEntreprises",listeEntreprises);
        return "entreprises";
    }

    @GetMapping("/entreprises/delete/{id}")
    public String supprimerEntreprise(@PathVariable(name = "id") Integer id, RedirectAttributes redirectAttributes){
        incService.supprimer(id);
        redirectAttributes.addFlashAttribute("message", "L'entreprise ID " + id + " a été supprimé avec succès ");
        return "redirect:/entreprises";
    }

    @GetMapping("/entreprises/{id}")
    public String afficherEmploiParEntreprise(@PathVariable("id") Integer id, Model model){
        Entreprise entreprise = incService.findById(id);
        List<Emploi> listeEmploisEntreprise= incService.getEmploisByEntreprise(entreprise);
        model.addAttribute("entreprise", entreprise);
        model.addAttribute("listeEmploisEntreprise", listeEmploisEntreprise);
        return "redirect:/entreprises";
    }
}
