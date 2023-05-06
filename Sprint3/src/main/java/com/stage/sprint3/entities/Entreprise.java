package com.stage.sprint3.entities;

import javax.persistence.*;
@Entity
@Table(name = "entreprise")
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInc;
    @Column(name = "nom", length = 120, unique = true, nullable = false)
    private String nom;
    @Column(name = "address", length = 120, nullable = false)
    private String address;
    @Column(name="telephone", length = 128, nullable = false, unique = true)
    private String telephone;
    @Column(name="email", length = 128, nullable = false, unique = true)
    private String email;
    @Column(name = "password",length = 64, nullable = false)
    private String password;
    public Entreprise() {
    }
    public Entreprise( String nom, String address,String email, String password) {
        this.nom = nom;
        this.address = address;
        this.email = email;
        this.password = password;
    }
    public Entreprise(int idInc, String nom, String address, String telephone, String email, String password) {
        this.idInc = idInc;
        this.email = email;
        this.nom = nom;
        this.address = address;
        this.password = password;
        this.telephone = telephone;
    }

    public int getIdInc() {
        return idInc;
    }

    public void setIdInc(int idInc) {
        this.idInc = idInc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}