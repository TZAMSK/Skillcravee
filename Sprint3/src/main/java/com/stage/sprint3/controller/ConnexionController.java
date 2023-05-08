package com.stage.sprint3.controller;

import com.stage.sprint3.entities.*;
import com.stage.sprint3.repos.EtudiantRepository;
import com.stage.sprint3.service.AdministrateurService;
import com.stage.sprint3.service.EntrepriseService;
import com.stage.sprint3.service.EtudiantService;
import com.stage.sprint3.service.ProfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
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


    @PostMapping("/login/connect")
    public String submitForm(@ModelAttribute("formulaire") Formulaire formulaire, HttpServletResponse response,
                             @RequestParam("selection") String selection, RedirectAttributes redirectAttributes,
                             HttpSession session, @RequestParam(value = "RememberMe", defaultValue = "NO") String souvenir,
                             @RequestParam(value = "etudiantEmail", required = false) String etudiantEmail,
                             @RequestParam(value = "etudiantPassword", required = false) String etudiantPassword,
                             @RequestParam(value = "profEmail", required = false) String profEmail,
                             @RequestParam(value = "profPassword", required = false) String profPassword,
                             @RequestParam(value = "entrepriseEmail", required = false) String entrepriseEmail,
                             @RequestParam(value = "entreprisePassword", required = false) String entreprisePassword,
                             @RequestParam(value = "adminEmail", required = false) String adminEmail,
                             @RequestParam(value = "adminPassword", required = false) String adminPassword) {

        if (selection.equals("Étudiant")) {
            if (etudiantEmail != null) {
                etudiantEmail = etudiantEmail.trim();
            }
            if (etudiantPassword != null) {
                etudiantPassword = etudiantPassword.trim();
            }
            Etudiant etudiant = etudiantService.loginEtudiant(etudiantEmail, etudiantPassword);
            if (etudiant != null && etudiant.getEmail().equals(etudiantEmail) && etudiant.getPassword().equals(etudiantPassword)) {
                session.setAttribute("email", etudiantEmail);
                session.setAttribute("password", etudiantPassword);
                if (souvenir != null && souvenir.equals("YES")) {
                    Cookie emailcookie = new Cookie("email", etudiantEmail);
                    Cookie passwordcookie = new Cookie("password", etudiantPassword);
                    emailcookie.setMaxAge(60 * 60);
                    passwordcookie.setMaxAge(60 * 60);
                    response.addCookie(emailcookie);
                    response.addCookie(passwordcookie);
                }
                redirectAttributes.addFlashAttribute("message", "L'étudiant est connecté");
                return "redirect:/index";
            }
        } else if (selection.equals("Professeur")) {
            if (profEmail != null) {
                profEmail = profEmail.trim();
            }
            if (profPassword != null) {
                profPassword = profPassword.trim();
            }
            Prof prof = profService.loginProf(profEmail, profPassword);
            if (prof != null && prof.getEmail().equals(profEmail) && prof.getPassword().equals(profPassword)) {
                session.setAttribute("email", profEmail);
                session.setAttribute("password", profPassword);
                if (souvenir != null && souvenir.equals("YES")) {
                    Cookie emailcookie = new Cookie("email", profEmail);
                    Cookie passwordcookie = new Cookie("password", profPassword);
                    emailcookie.setMaxAge(60 * 60);
                    passwordcookie.setMaxAge(60 * 60);
                    response.addCookie(emailcookie);
                    response.addCookie(passwordcookie);
                }
                redirectAttributes.addFlashAttribute("message", "Le Prof est connecté");
                return "redirect:/index";
            }
        } else if (selection.equals("Entreprise")) {
            if (entrepriseEmail != null) {
                entrepriseEmail = entrepriseEmail.trim();
            }
            if (entreprisePassword != null) {
                entreprisePassword = entreprisePassword.trim();
            }
            Entreprise entreprise = entrepriseService.loginEntreprise(entrepriseEmail, entreprisePassword);
            if (entreprise != null && entreprise.getEmail().equals(entrepriseEmail) && entreprise.getPassword().equals(entreprisePassword)) {
                session.setAttribute("email", entrepriseEmail);
                session.setAttribute("password", entreprisePassword);
                if (souvenir != null && souvenir.equals("YES")) {
                    Cookie emailcookie = new Cookie("email", entrepriseEmail);
                    Cookie passwordcookie = new Cookie("password", entreprisePassword);
                    emailcookie.setMaxAge(60 * 60);
                    passwordcookie.setMaxAge(60 * 60);
                    response.addCookie(emailcookie);
                    response.addCookie(passwordcookie);
                }
                redirectAttributes.addFlashAttribute("message", "L'entreprise est connectée");
                return "redirect:/index";
            }
        } else if (selection.equals("Administrateur")) {
            if (adminEmail != null) {
                adminEmail = adminEmail.trim();
            }
            if (adminPassword != null) {
                adminPassword = adminPassword.trim();
            }
            Administration administration = administrateurService.loginadmin(adminEmail, adminPassword);
            if (administration != null && administration.getEmail().equals(adminEmail) && administration.getPassword().equals(adminPassword)) {
                session.setAttribute("email", adminEmail);
                session.setAttribute("password", adminPassword);
                if (souvenir != null && souvenir.equals("YES")) {
                    Cookie emailcookie = new Cookie("email", adminEmail);
                    Cookie passwordcookie = new Cookie("password", adminPassword);
                    emailcookie.setMaxAge(60 * 60);
                    passwordcookie.setMaxAge(60 * 60);
                    response.addCookie(emailcookie);
                    response.addCookie(passwordcookie);
                }
                redirectAttributes.addFlashAttribute("message", "L'administrateur est connecté");
                return "redirect:/index";
            }
        }

        redirectAttributes.addFlashAttribute("message", "Impossible de se connecter");
        return "redirect:/login";
    }

}