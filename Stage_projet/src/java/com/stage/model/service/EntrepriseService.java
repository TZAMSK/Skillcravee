package com.stage.model.service;


import com.stage.model.dao.EntrepriseImplDao;
import com.stage.model.entities.Entreprise;
import java.util.List;

public class EntrepriseService {
    EntrepriseImplDao entrepriseDao = new EntrepriseImplDao();
    boolean retour = false;
 

    public List<Entreprise> afficherLesEntreprises() {
        return entrepriseDao.findAll();
    }

    public Entreprise findEntrepriseById(int id) {
        return entrepriseDao.findById(id);
    }

    public Entreprise findEntrepriseByName(String name) {
        return entrepriseDao.findByName(name);
    }

    public Entreprise findEntrepriseByEmail(String email) {
        return entrepriseDao.findByEmail(email);
    }
    
    public boolean ajouterUneEntreprise(Entreprise entreprise) {
        if (entrepriseDao.create(entreprise)) {
            retour = true;
        }
        return retour;
    }
}
