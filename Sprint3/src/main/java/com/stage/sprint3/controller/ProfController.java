package com.stage.sprint3.controller;

import com.stage.sprint3.entities.Etudiant;
import com.stage.sprint3.entities.Prof;
import com.stage.sprint3.service.EtudiantService;
import com.stage.sprint3.service.ProfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProfController {

    @Autowired
    ProfService profService;
    @GetMapping("/profs")
    public String afficherProfs(Model model){
        Iterable<Prof> listeProfs = profService.afficherProfs();
        model.addAttribute("listeProfs",listeProfs);
        return "profs";
    }

    @GetMapping("/profs/delete/{id}")
    public String supprimerProf(@PathVariable(name = "id") Integer id, RedirectAttributes redirectAttributes){
        profService.supprimer(id);
        redirectAttributes.addFlashAttribute("message", "Le professeur ID " + id + " a été supprimé avec succès ");
        return "redirect:/profs";
    }
    @GetMapping("rechercher/profs")
    public String rechercherProf(Model model, @Param("keyword") String keyword){
        List<Prof> listeProfs = profService.rechercherProfParNom(keyword);
        model.addAttribute("listeProfs", listeProfs);
        model.addAttribute("keyword", keyword);
        return "profs";
    }



}
