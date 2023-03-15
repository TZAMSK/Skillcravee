package com.stage.chezbio.model.entities;

import java.io.Serializable;

/**
 *
 * @author phili
 */
public class Administrateur implements Serializable{
    private int IdAdmin;
    private String NomAdmin;
    private String PrenomAdmin;
    private String emailAdmin;
    private String PasswordAdmin;
   
    public Administrateur(int id, String nom, String prenom, String email, String password){
        this.IdAdmin = id;
        this.NomAdmin = nom;
        this.PrenomAdmin = prenom;
        this.emailAdmin = email;
        this.PasswordAdmin = password;
    }

    public Administrateur() {
    }
    
    public int getIdAdmin(){
        return IdAdmin;
    }
    public void setIdAdmin(int idAdmin){
        this.IdAdmin = idAdmin;
    }
    
    
    public String getNomAdmin(){
        return NomAdmin;
    }
    public void setNomAdmin(String nomAdmin){
        this.NomAdmin = nomAdmin;
    }
    
    
    public String getPasswordAdmin(){
        return PasswordAdmin;
    }
    public void setPasswordAdmin(String passwordAdmin){
        this.PasswordAdmin = passwordAdmin;
    }

    public String getPrenomAdmin() {
        return PrenomAdmin;
    }

    public void setPrenomAdmin(String PrenomAdmin) {
        this.PrenomAdmin = PrenomAdmin;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }
    
}
