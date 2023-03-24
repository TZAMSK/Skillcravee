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
    private String EmailAdmin;
    private String UsernameAdmin;
    private String PasswordAdmin;
   
    public Administrateur(int idAdmin, String nomAdmin,String PasswordAdmin){
        this.IdAdmin = idAdmin;
        this.NomAdmin = nomAdmin;
        this.PasswordAdmin = PasswordAdmin;
    }
    
    public Administrateur(int IdAdmin, String nomAdmin, String PrenomAdmin, String EmailAdmin, String UsernameAdmin, String PasswordAdmin){
        this.IdAdmin = IdAdmin;
        this.NomAdmin = NomAdmin;
        this.PrenomAdmin = PrenomAdmin;
        this.EmailAdmin = EmailAdmin;
        this.UsernameAdmin = UsernameAdmin;
        this.PasswordAdmin = PasswordAdmin;
    }
    
    public Administrateur(){
        this.IdAdmin = IdAdmin;
        this.NomAdmin = NomAdmin;
        this.PrenomAdmin = PrenomAdmin;
        this.EmailAdmin = EmailAdmin;
        this.UsernameAdmin = UsernameAdmin;
        this.PasswordAdmin = PasswordAdmin;
    }
    
    public int getIdAdmin(){
        return IdAdmin;
    }
    public void setIdAdmin(int IdAdmin){
        this.IdAdmin = IdAdmin;
    }
    
    
    public String getNomAdmin(){
        return NomAdmin;
    }
    public void setNomAdmin(String NomAdmin){
        this.NomAdmin = NomAdmin;
    }
    
    public String getPrenomAdmin(){
        return PrenomAdmin;
    }
    public void setPrenomAdmin(String PrenomAdmin){
        this.PrenomAdmin = PrenomAdmin;
    }
    
    public String getEmailAdmin(){
        return EmailAdmin;
    }
    public void setEmailAdmin(String EmailAdmin){
        this.PrenomAdmin = EmailAdmin;
    }
    
    public String getUsernameAdmin(){
        return UsernameAdmin;
    }
    public void setUsernameAdmin(String UsernameAdmin){
        this.UsernameAdmin = UsernameAdmin;
    }
    
    public String getPasswordAdmin(){
        return PasswordAdmin;
    }
    public void setPasswordAdmin(String passwordAdmin){
        this.PasswordAdmin = PasswordAdmin;
    }
    
    
}
