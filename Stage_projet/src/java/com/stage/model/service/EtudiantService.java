package com.stage.model.service;

import java.util.List;
import com.stage.model.dao.EtudiantImplDao;
import com.stage.model.entities.Etudiant;

public class EtudiantService {
    EtudiantImplDao etudiantDao = new EtudiantImplDao();
    boolean retour = false; 


    public List<Etudiant> afficherLesEtudiants() {
        return etudiantDao.findAll();
    }

    public Etudiant chercherEtudiantParId(int id) {
        return etudiantDao.findById(id);
    }

    public Etudiant chercherEtudiantParEmail(String email) {
        return etudiantDao.findByEmail(email);
    }

    public Etudiant chercherEtudiantParNom(String nom) {
        return etudiantDao.findByName(nom);
    }

    public Etudiant verifierEmailMotDePasseAdministrateur(String email, String motDePasse) {
        return etudiantDao.existsByEmailAndPassword(email, motDePasse);
    }
    public boolean ajouterUnEtudiant(Etudiant etudiant) {
        if (etudiantDao.create(etudiant)) {
            retour = true;
        }
        return retour;
    }
}
