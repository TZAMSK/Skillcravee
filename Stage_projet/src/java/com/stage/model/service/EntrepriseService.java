package com.stage.model.service;


import com.stage.model.dao.EntrepriseImplDao;
import com.stage.model.entities.Entreprise;
import java.util.List;

public class EntrepriseService {
    
    EntrepriseImplDao daoEntreprise = new EntrepriseImplDao();
    private List<Entreprise> listeEntreprise;
    Entreprise entreprise = null;
    boolean retour =false;
 

    public List<Entreprise> afficherLesEntreprises() {
        listeEntreprise = daoEntreprise.findAll();
        return listeEntreprise;
    }

    public Entreprise findEntrepriseById(int id) {
        entreprise = daoEntreprise.findById(id);
        return entreprise;
    }

    public Entreprise findEntrepriseByName(String name) {
        entreprise = daoEntreprise.findByName(name);
        return entreprise;
    }

    public Entreprise findEntrepriseByEmail(String email) {
        entreprise = daoEntreprise.findByName(email);
        return entreprise;
    }
    
    public boolean ajouterUneEntreprise(Entreprise entreprise) {
       if ( daoEntreprise.create(entreprise)) {
             retour = true;
        }
    
       return retour;
    }
}
