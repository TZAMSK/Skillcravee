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
    
    public Entreprise(int idInc, String nomInc, int telephone, String email, String contact, String passwordInc){
        this.IDInc = idInc;
        this.NomInc = nomInc;
        this.Telephone = telephone;
        this.Email = email;
        this.Contact = contact;
        this.PasswordInc = passwordInc;
    }

    public Entreprise() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    
    
    public String getemail(){
        return Email;
    }
    public void setemail(String email){
        this.Email = email;
    }
    
    
    public String getContact(){
        return Contact;
    }
    public void setContact(String contact){
        this.Contact = contact;
    }
    
    
    public String getPasswordInc(){
        return PasswordInc;
    }
    public void setPasswordInc(String passwordInc){
        this.PasswordInc = passwordInc;
    }
}
