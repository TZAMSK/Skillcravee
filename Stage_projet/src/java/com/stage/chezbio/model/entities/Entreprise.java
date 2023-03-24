package com.stage.chezbio.model.entities;

import java.io.Serializable;

/**
 *
 * @author phili
 */
public class Entreprise implements Serializable{
    private int IDInc;
    private String NomInc;
    private int Telephone;
    private String Email;
    private String Contact;
    private String PasswordInc;
    
    public Entreprise(int IDInc, String NomInc, int Telephone, String Email, String Contact, String PasswordInc){
        this.IDInc = IDInc;
        this.NomInc = NomInc;
        this.Telephone = Telephone;
        this.Email = Email;
        this.Contact = Contact;
        this.PasswordInc = PasswordInc;
    }
    
    public Entreprise(){
        this.IDInc = IDInc;
        this.NomInc = NomInc;
        this.Telephone = Telephone;
        this.Email = Email;
        this.Contact = Contact;
        this.PasswordInc = PasswordInc;
    }
    
    public int getIDInc(){
        return IDInc;
    }
    public void setIDInc(int IDInc){
        this.IDInc = IDInc;
    }
    
    public String getNomInc(){
        return NomInc;
    }
    public void setNomInc(String NomInc){
        this.NomInc = NomInc;
    }
    
    public int getTelephone(){
        return Telephone;
    }
    public void setTelephone(int Telephone){
        this.Telephone = Telephone;
    }
    
    
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    
    public String getContact(){
        return Contact;
    }
    public void setContact(String Contact){
        this.Contact = Contact;
    }
    
    
    public String getPasswordInc(){
        return PasswordInc;
    }
    public void setPasswordInc(String passwordInc){
        this.PasswordInc = PasswordInc;
    }
}
