package com.stage.sprint3.entities;

import javax.persistence.*;


@Entity
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom", length = 120, unique = true, nullable = false)
    private String nom;

    @Column(name = "prenom", length = 120, unique = true, nullable = false)
    private String prenom;

    @Column(name="email", length = 128, nullable = false, unique = true)
    private String email;
    @Column(name = "password",length = 64, nullable = false)
    private String password;

    private boolean statusStage;

}
