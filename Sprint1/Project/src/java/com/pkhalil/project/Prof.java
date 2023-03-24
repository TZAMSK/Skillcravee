package com.stage.chezbio.model.entities;

import java.io.Serializable;

/**
 *
 * @author phili
 */
public class Prof implements Serializable{
    private int IDProf;
    private String NomProf;
    private String PrenomProf;
    private String emailProf;
    private String passwordProf;
    
    public Prof(int idProf, String nomProf, String prenomProf, String email, String password){
        this.IDProf = idProf;
        this.NomProf = nomProf;
        this.PrenomProf = prenomProf;
        this.emailProf = email;
        this.passwordProf = password;
    }

    public Prof(){}
    
    
    
    public String getPrenomProf(){
        return PrenomProf;
    }
    public void setPrenomProf(String prenomProf){
        this.PrenomProf = prenomProf;
    }
    
    
    public String getNomProf(){
        return NomProf;
    }
    public void setNomProf(String nomProf)
    {
        this.NomProf = nomProf;
    }
    
    
    public int getIDProf(){
        return IDProf;
    }
    public void setIDProf(int idProf){
        this.IDProf = idProf;
    }

    public String getEmailProf() {
        return emailProf;
    }

    public void setEmailProf(String emailProf) {
        this.emailProf = emailProf;
    }

    public String getPasswordProf() {
        return passwordProf;
    }

    public void setPasswordProf(String passwordProf) {
        this.passwordProf = passwordProf;
    }
    
}
