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
    private String EmailProf;
    private String PasswordProf;
    
    public Prof(int idProf, String nomProf, String prenomProf){
        this.IDProf = idProf;
        this.NomProf = nomProf;
        this.PrenomProf = prenomProf;
    }
    
    public Prof(int idProf, String nomProf, String prenomProf, String EmailProf, String PasswordProf){
        this.IDProf = idProf;
        this.NomProf = nomProf;
        this.PrenomProf = prenomProf;
        this.EmailProf = EmailProf;
        this.PasswordProf = PasswordProf;
    }
    
    
    public Prof(){
        this.IDProf = IDProf;
        this.NomProf = NomProf;
        this.PrenomProf = PrenomProf;
        this.EmailProf = EmailProf;
        this.PasswordProf = PasswordProf;
    }
    
    
    public String getPrenomProf(){
        return PrenomProf;
    }
    public void setPrenomProf(String PrenomProf){
        this.PrenomProf = PrenomProf;
    }
    
    
    public String getNomProf(){
        return NomProf;
    }
    public void setNomProf(String NomProf)
    {
        this.NomProf = NomProf;
    }
    
    
    public int getIDProf(){
        return IDProf;
    }
    public void setIDProf(int IDProf){
        this.IDProf = IDProf;
    }
    
    
    public String getEmailProf(){
        return EmailProf;
    }
    public void setEmailProf(String EmailProf){
        this.EmailProf = EmailProf;
    }
    
    public String getPasswordProf(){
        return PasswordProf;
    }
    public void setPasswordProf(String PasswordProf){
        this.PasswordProf = PasswordProf;
    }
    
}
