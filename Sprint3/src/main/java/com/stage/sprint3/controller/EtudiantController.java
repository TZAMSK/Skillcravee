package com.stage.sprint3.controller;

import com.stage.sprint3.entities.CV;
import com.stage.sprint3.entities.Etudiant;
import com.stage.sprint3.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

    @GetMapping("rechercher/etudiants")
    public String rechercherEtudiant(Model model, @Param("keyword") String keyword){
        List<Etudiant> listeEtudiants = etudiantService.rechercherEtudiantParNom(keyword);
        model.addAttribute("listeEtudiants", listeEtudiants);
        model.addAttribute("keyword", keyword);
        return "etudiants";
    }

    @GetMapping("/etudiants/delete/{id}")
    public String supprimerEtudiant(@PathVariable(name = "id") Integer id, RedirectAttributes redirectAttributes){
        etudiantService.supprimer(id);
        redirectAttributes.addFlashAttribute("message", "L'etudiant ID " + id + " a été supprimé avec succès ");
        return "redirect:/etudiants";
    }

    @GetMapping("/etudiants/{id}/stage/{status}")
    public String changerStage(@PathVariable("id") Integer id, @PathVariable("status") boolean statusStage, RedirectAttributes redirectAttributes) {
        etudiantService.updateStatus(id, statusStage);
        String status = statusStage ? "active" : "desactive";
        String message = "L'étudiant " + id + " travaille dans un stage: " + status;
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/etudiants";
    }

    @PostMapping("/etudiants/save")
    public String editerEtud(Etudiant etud, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","L'étudiant a été édité avec success");
        etudiantService.ajouterEtudiant(etud);
        return "redirect:/etudiants";
    }
    @GetMapping("/etudiants/edit/{id}")
    public String EditerEtudiant(@PathVariable(name = "id") Integer id, Model model){
        Etudiant etud = etudiantService.get(id);
        model.addAttribute("PageTitle", "Editer Étudiant ID: " + id);
        model.addAttribute("etud", etud);
        return "etudiant-editer";
    }

}
