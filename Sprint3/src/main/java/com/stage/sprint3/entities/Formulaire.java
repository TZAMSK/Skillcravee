package com.stage.sprint3.entities;

import net.bytebuddy.asm.Advice;

public class Formulaire{
    private Etudiant etudiant;
    private Prof prof;
    private Entreprise entreprise;

    public Formulaire() {
        this.etudiant = new Etudiant();
        this.prof = new Prof();
        this.entreprise = new Entreprise();
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }
    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
}
