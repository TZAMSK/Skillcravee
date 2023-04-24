package com.stage.model.service;


import com.stage.model.dao.ProfImplDao;
import com.stage.model.entities.Prof;
import java.util.List;

public class ProfService {

    ProfImplDao daoProf = new ProfImplDao();
    private List<Prof> listeProf;
    Prof prof = null;
    boolean retour =false;

    public List<Prof> afficherLesProfs() {
        listeProf = daoProf.findAll();
        return listeProf;
    }

    public Prof chercherProfParId(int id) {
        prof = daoProf.findById(id);
        return prof;
    }

    public Prof chercherProfParNom(String nom) {
        prof = daoProf.findByName(nom);
        return prof;
    }

    public boolean ajouterUnProf(Prof prof) {
        if (daoProf.create(prof)) {
            retour = true;
        }
        return retour;
    }

}
