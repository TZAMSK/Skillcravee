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
    
    public Prof(int idProf, String nomProf, String prenomProf){
        this.IDProf = idProf;
        this.NomProf = nomProf;
        this.PrenomProf = prenomProf;
    }
    
    
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
}
