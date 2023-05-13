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
                             HttpSession session, @RequestParam(value = "RememberMe", defaultValue = "NO") String souvenir) {
        if (selection.equals("Étudiant")) {
            Etudiant etudiant = formulaire.getEtudiant();
            String email = etudiant.getEmail().trim();
            String password = etudiant.getPassword().trim();
            Etudiant etudiantLogged = etudiantService.loginEtudiant(email, password);
            if (etudiantLogged != null && etudiantLogged.getEmail().equals(email) && etudiantLogged.getPassword().equals(password)) {
                session.setAttribute("email", email);
                session.setAttribute("password", password);
                if (souvenir != null && souvenir.equals("YES")) {
                    Cookie emailcookie = new Cookie("email", email);
                    Cookie passwordcookie = new Cookie("password", password);
                    emailcookie.setMaxAge(60 * 60);
                    passwordcookie.setMaxAge(60 * 60);
                    response.addCookie(emailcookie);
                    response.addCookie(passwordcookie);
                }
                redirectAttributes.addFlashAttribute("message", "L'étudiant est connecté");
                session.setAttribute("nomEtud", etudiantLogged.getNom());
                session.setAttribute("prenomEtud", etudiantLogged.getPrenom());
                session.setAttribute("statusStage", etudiantLogged.isStatusStage());
                session.setAttribute("numeroStage", etudiantLogged.getNumeroStage());
                session.setAttribute("retenir", etudiantLogged.isRetenir());
                //session.setAttribute("CV", etudiantLogged.getCV());
                session.setAttribute("role", "étudiant");
                return "index";
            }
        } else if (selection.equals("Professeur")) {
            Prof prof = formulaire.getProf();
            String email = prof.getEmail().trim();
            String password = prof.getPassword().trim();
            Prof profLogged = profService.loginProf(email, password);
            if (profLogged != null && profLogged.getEmail().equals(email) && profLogged.getPassword().equals(password)) {
                session.setAttribute("email", email);
                session.setAttribute("password", password);
                if (souvenir != null && souvenir.equals("YES")) {
                    Cookie emailcookie = new Cookie("email", email);
                    Cookie passwordcookie = new Cookie("password", password);
                    emailcookie.setMaxAge(60 * 60);
                    passwordcookie.setMaxAge(60 * 60);
                    response.addCookie(emailcookie);
                    response.addCookie(passwordcookie);
                }
                redirectAttributes.addFlashAttribute("message", "Le Prof est connecté");
                session.setAttribute("nomProf", profLogged.getNom());
                session.setAttribute("prenomProf", profLogged.getPrenom());
                session.setAttribute("role", "prof");
                return "index";
            }
        } else if (selection.equals("Entreprise")) {
            Entreprise entreprise = formulaire.getEntreprise();
            String email = entreprise.getEmail().trim();
            String password = entreprise.getPassword().trim();
            Entreprise entrepriseLogged = entrepriseService.loginEntreprise(email, password);
            if (entrepriseLogged != null && entrepriseLogged.getEmail().equals(email) && entrepriseLogged.getPassword().equals(password)) {
                session.setAttribute("email", email);
                session.setAttribute("password", password);
                if (souvenir != null && souvenir.equals("YES")) {
                    Cookie emailcookie = new Cookie("email", email);
                    Cookie passwordcookie = new Cookie("password", password);
                    emailcookie.setMaxAge(60 * 60);
                    passwordcookie.setMaxAge(60 * 60);
                    response.addCookie(emailcookie);
                    response.addCookie(passwordcookie);
                }
                redirectAttributes.addFlashAttribute("message", "L'entreprise est connectée");
                session.setAttribute("nomInc", entrepriseLogged.getNom());
                session.setAttribute("address", entrepriseLogged.getAddress());
                session.setAttribute("telephone", entrepriseLogged.getTelephone());
                session.setAttribute("role", "entreprise");
                return "index";
            }
        } else if (selection.equals("Administrateur")) {
            Administration administration = formulaire.getAdministration();
            String email = administration.getEmail().trim();
            String password = administration.getPassword().trim();
            Administration administrationLogged = administrateurService.loginadmin(email, password);
            if (administrationLogged != null && administrationLogged.getEmail().equals(email) && administrationLogged.getPassword().equals(password)) {
                session.setAttribute("email", email);
                session.setAttribute("password", password);
                if (souvenir != null && souvenir.equals("YES")) {
                    Cookie emailcookie = new Cookie("email", email);
                    Cookie passwordcookie = new Cookie("password", password);
                    emailcookie.setMaxAge(60 * 60);
                    passwordcookie.setMaxAge(60 * 60);
                    response.addCookie(emailcookie);
                    response.addCookie(passwordcookie);
                }
                redirectAttributes.addFlashAttribute("message", "L'administrateur est connecté");
                session.setAttribute("nomAdmin", administrationLogged.getNom());
                session.setAttribute("prenomAdmin", administrationLogged.getPrenom());
                session.setAttribute("username", administrationLogged.getUsername());
                session.setAttribute("role", "admin");
                return "index";
            }
        }

        redirectAttributes.addFlashAttribute("message", "Impossible de se connecter");
        return "redirect:/login";
    }

}