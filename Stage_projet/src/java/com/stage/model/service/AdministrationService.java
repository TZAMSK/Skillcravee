/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stage.model.service;

import com.stage.model.dao.AdminImplDao;
import com.stage.model.entities.Administrateur;
import java.util.List;

/**
 *
 * @author rafaelfo
 */
public class AdministrationService {
    
    AdminImplDao daoAdmin = new AdminImplDao();
    private List<Administrateur> listeAdministrateur;
    Administrateur administrateur = null;

    public List<Administrateur> afficherLesAdministrateurs() {
        listeAdministrateur = daoAdmin.findAll();
        return listeAdministrateur;
    }

    public Administrateur chercherAdministrateurParId(int id) {
        administrateur = daoAdmin.findById(id);
        return administrateur;
    }

    public Administrateur chercherAdministrateurParNom(String name) {
        administrateur = daoAdmin.findByName(name);
        return administrateur;
    }

    public Administrateur verifierMotDePasseAdministrateur(String motDePasse) {
        administrateur = daoAdmin.existsByPassword(motDePasse);
        return administrateur;
    }
}
