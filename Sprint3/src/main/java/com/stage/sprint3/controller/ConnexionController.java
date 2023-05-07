package com.stage.sprint3.controller;

import com.stage.sprint3.entities.*;
import com.stage.sprint3.repos.EtudiantRepository;
import com.stage.sprint3.service.AdministrateurService;
import com.stage.sprint3.service.EntrepriseService;
import com.stage.sprint3.service.EtudiantService;
import com.stage.sprint3.service.ProfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

@Controller
public class ConnexionController {
    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    private EtudiantService etudiantService;

    @Autowired
    private EntrepriseService entrepriseService;

    @Autowired
    private ProfService profService;

    @Autowired
    private AdministrateurService administrateurService;
    @GetMapping("/login")
    public String Login(Model model){
        model.addAttribute("formulaire", new Formulaire());
        return "connexion";
    }


    @RequestMapping(value = "/login/connect", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("formulaire") Formulaire formulaire, @RequestParam("selection") String selection, @RequestParam("email") String email, @RequestParam("password") String password,RedirectAttributes redirectAttributes, HttpSession session, @RequestParam("RememberMe") String souvenir) {
        if (selection.equals("Étudiant")) {
            Etudiant etudiant = null;
            etudiant = etudiantService.loginEtudiant(email, password);
            if(etudiant != null){
                session.setAttribute("email",email);
                session.setAttribute("password",password);
                if (souvenir != null){
                    Cookie emailcookie = new Cookie("email", email);
                    Cookie passwordcookie = new Cookie("password", password);
                    emailcookie.setMaxAge(60*60);
                    passwordcookie.setMaxAge(60*60);
                }
                redirectAttributes.addFlashAttribute("message", "L'étudiant est connecté");
                return "index";
            }
            if (etudiant == null){
                redirectAttributes.addFlashAttribute("message", "Impossible de se connecter");
                return "redirect:/connexion";
            }


        } else if (selection.equals("Professeur")) {
            Prof prof = null;
            prof = profService.loginProf(email, password);
            if(prof != null){
                session.setAttribute("email",email);
                session.setAttribute("password",password);
                if (souvenir != null){
                    Cookie emailcookie = new Cookie("email", email);
                    Cookie passwordcookie = new Cookie("password", password);
                    emailcookie.setMaxAge(60*60);
                    passwordcookie.setMaxAge(60*60);
                }
                redirectAttributes.addFlashAttribute("message", "Le Prof est connecté");
                return "index";
            }
            if (prof == null){
                redirectAttributes.addFlashAttribute("message", "Impossible de se connecter");
                return "redirect:/connexion";
            }

        } else if (selection.equals("Entreprise")) {
            Entreprise entreprise = null;
            entreprise = entrepriseService.loginEntreprise(email, password);
            if(entreprise != null){
                session.setAttribute("email",email);
                session.setAttribute("password",password);
                if (souvenir != null){
                    Cookie emailcookie = new Cookie("email", email);
                    Cookie passwordcookie = new Cookie("password", password);
                    emailcookie.setMaxAge(60*60);
                    passwordcookie.setMaxAge(60*60);
                }
                redirectAttributes.addFlashAttribute("message", "L'entreprise est connecté");
                return "index";
            }
            if (entreprise == null){
                redirectAttributes.addFlashAttribute("message", "Impossible de se connecter");
                return "redirect:/connexion";
            }
        }else if (selection.equals("Administrateur")){
            Administration administration = null;
            administration = administrateurService.loginadmin(email, password);
            if(administration != null){
                session.setAttribute("email",email);
                session.setAttribute("password",password);
                if (souvenir != null){
                    Cookie emailcookie = new Cookie("email", email);
                    Cookie passwordcookie = new Cookie("password", password);
                    emailcookie.setMaxAge(60*60);
                    passwordcookie.setMaxAge(60*60);
                }
                redirectAttributes.addFlashAttribute("message", "L'admin est connecté");
                return "index";
            }
            if (administration == null){
                redirectAttributes.addFlashAttribute("message", "Impossible de se connecter");
                return "redirect:/connexion";
            }
        }
        return "index";
    }

}