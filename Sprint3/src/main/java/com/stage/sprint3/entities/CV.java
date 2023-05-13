package com.stage.sprint3.entities;

import javax.persistence.*;


@Entity
@Table(name = "cv")
public class CV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom", length = 120, unique = true, nullable = false)
    private String nom;

    @OneToOne(optional = false)
    @JoinColumn(name = "etudiant", nullable = false)
    private Etudiant etudiant;

    public CV(int id, String nom, Etudiant etudiant) {
        this.id = id;
        this.nom = nom;
        this.etudiant = etudiant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

}