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
    private char Email;
    private String Contact;
    private char PasswordInc;
    
    public Entreprise(int idInc, String nomInc, int telephone, char email, String contact, char passwordInc){
        this.IDInc = idInc;
        this.NomInc = nomInc;
        this.Telephone = telephone;
        this.Email = email;
        this.Contact = contact;
        this.PasswordInc = passwordInc;
    }
    
    public int getIDInc(){
        return IDInc;
    }
    public void setIDInc(int idInc){
        this.IDInc = idInc;
    }
    
    public String getNomInc(){
        return NomInc;
    }
    public void setNomInc(String nomInc){
        this.NomInc = nomInc;
    }
    
    public int getTelephone(){
        return Telephone;
    }
    public void setTelephone(int telephone){
        this.Telephone = telephone;
    }
    
    
    public char getemail(){
        return Email;
    }
    public void setemail(char email){
        this.Email = email;
    }
    
    
    public String getContact(){
        return Contact;
    }
    public void setContact(String contact){
        this.Contact = contact;
    }
    
    
    public char getPasswordInc(){
        return PasswordInc;
    }
    public void setPasswordInc(char passwordInc){
        this.PasswordInc = passwordInc;
    }
}
