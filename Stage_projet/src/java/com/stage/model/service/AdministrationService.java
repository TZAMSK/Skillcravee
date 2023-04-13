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

    private List<Administrateur> afficherLesAdministrateurs() {
        return daoAdmin.findAll();
    }

    public Administrateur chercherAdministrateurParId(int id) {
        return daoAdmin.findById(id);
    }

    public Administrateur chercherAdministrateurParNom(String name) {
        return daoAdmin.findByName(name);
    }

    public Administrateur verifierMotDePasseAdministrateur(String password) {
        return daoAdmin.existsByPassword(password);
    }
}
