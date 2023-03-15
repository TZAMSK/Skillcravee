/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkhalil.project;

import java.io.Serializable;

/**
 *
 * @author phili
 */
public class Prof implements Serializable{
    private int IDProf;
    private String NomProf;
    private String PrenomProf;
    private char PasswordProf;
    
    public Prof(int idProf, String nomProf, String prenomProf, char passwordProf){
        this.IDProf = idProf;
        this.NomProf = nomProf;
        this.PrenomProf = prenomProf;
        this.PasswordProf = passwordProf;
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
    
    
    public char getPasswordProf(){
        return PasswordProf;
    }
    public void setPasswordProf(char passwordProf){
        this.PasswordProf = passwordProf;
    }
}
