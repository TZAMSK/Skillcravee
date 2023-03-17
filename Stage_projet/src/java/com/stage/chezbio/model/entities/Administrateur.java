package com.stage.chezbio.model.entities;

import java.io.Serializable;

/**
 *
 * @author phili
 */
public class Administrateur implements Serializable{
    private int IdAdmin;
    private String NomAdmin;
    private char PasswordAdmin;
   
    public Administrateur(int idAdmin, String nomAdmin,char passwordAdmin){
        this.IdAdmin = idAdmin;
        this.NomAdmin = nomAdmin;
        this.PasswordAdmin = passwordAdmin;
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
    
    
    public char getPasswordAdmin(){
        return PasswordAdmin;
    }
    public void setPasswordAdmin(char passwordAdmin){
        this.PasswordAdmin = passwordAdmin;
    }
}
