package com.stage.model.service;


import com.stage.model.dao.ProfImplDao;
import com.stage.model.entities.Prof;
import java.util.List;

public class ProfService {

    ProfImplDao profDAO = new ProfImplDao();;
    boolean retour = false;

    public List<Prof> afficherLesProfs() {
        return profDAO.findAll();
    }

    public Prof chercherProfParId(int id) {
        return profDAO.findById(id);
    }

    public Prof chercherProfParNom(String nom) {
        return profDAO.findByName(nom);
    }

    public boolean verifierMotDePasseProf(String password) {
        Prof prof = profDAO.existsByPassword(password);
        return prof != null;
    }
    public boolean ajouterUnProf(Prof prof) {
        if (profDAO.create(prof)) {
            retour = true;
        }
        return retour;
    }

}
