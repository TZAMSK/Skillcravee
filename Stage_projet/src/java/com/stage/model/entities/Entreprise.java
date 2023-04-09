package com.stage.model.entities;

import java.io.Serializable;

/**
 *
 * @author phili
 */
public class Entreprise implements Serializable{
    private int idInc;
    private String nomInc;
    private int telephone;
    private String email;
    private String adresse;
    private String passwordInc;
    
    public Entreprise(String NomInc, String adresse, int telephone, String email, String passwordInc){
        this.nomInc = NomInc;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.passwordInc = passwordInc;
    }
    
    public Entreprise(){}
    
    public int getIDInc(){
        return idInc;
    }
    public void setIDInc(int IDInc){
        this.idInc = IDInc;
    }
    
    public String getNomInc(){
        return nomInc;
    }
    public void setNomInc(String NomInc){
        this.nomInc = NomInc;
    }
    
    public int getTelephone(){
        return telephone;
    }
    public void setTelephone(int Telephone){
        this.telephone = Telephone;
    }
    
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email = Email;
    }
    
    
    public String getAdresse(){
        return adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    
    
    public String getPasswordInc(){
        return passwordInc;
    }
    public void setPasswordInc(String passwordInc){
        this.passwordInc = passwordInc;
    }
}
