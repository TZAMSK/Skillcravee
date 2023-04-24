package com.stage.model.service;

import java.util.List;
import com.stage.model.dao.EtudiantImplDao;
import com.stage.model.entities.Etudiant;

public class EtudiantService {
   
    EtudiantImplDao daoEtudiant = new EtudiantImplDao();
    private List<Etudiant> listeEtudiant;
    Etudiant etudiant = null;
    boolean retour =false;


    public List<Etudiant> afficherLesEtudiants() {
        listeEtudiant = daoEtudiant.findAll();
        return listeEtudiant;
    }

    public Etudiant chercherEtudiantParId(int id) {
        etudiant = daoEtudiant.findById(id);
        return etudiant;
    }

    public Etudiant chercherEtudiantParEmail(String email) {
        etudiant = daoEtudiant.findByEmail(email);
        return etudiant;
    }

    public Etudiant chercherEtudiantParNom(String nom) {
        etudiant = daoEtudiant.findByName(nom);
        return etudiant;
    }

    public Etudiant verifierEmailMotDePasseAdministrateur(String email, String motDePasse) {
        etudiant = daoEtudiant.existsByEmailAndPassword(email,motDePasse);
        return etudiant;
    }
    public boolean ajouterUnEtudiant(Etudiant etudiant) {
        if (daoEtudiant.create(etudiant)) {
            retour = true;
        }
        return retour;
    }
}
