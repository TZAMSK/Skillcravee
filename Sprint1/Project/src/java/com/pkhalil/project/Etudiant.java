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
public class Etudiant implements Serializable{
    private String Nom;
    private String Prenom;
    private int DA;
    private boolean statusStage;
    private int numeroStage;
    private boolean retenir;
    private char Password; 
   
    
    public Etudiant(String nom, String prenom, boolean status, char password, int da, boolean Retenir, int NumeroStage){
        this.Nom = nom ;
        this.Prenom = prenom ;
        this.Password = password;
        this.statusStage = status; 
        this.DA = da;
        this.retenir = Retenir;
        this.numeroStage = NumeroStage;
    }
    
    public String getPrenom(){
        return Prenom;
    }
    public void setPrenom(String prenom){
        this.Prenom = prenom;
    }
    
    
    public String getNom(){
        return Nom;
    }
    public void setNom(String nom)
    {
        this.Nom = nom;
    }
    
    
   public int getDA()
    {
       return DA;
    }
    public void setDA(int da){
        this.DA = da;
    }
    
    
    public char getPassword() {
        return Password;
    }
    public void setPassword(char password) {
        this.Password = password;
    }
    
    
    public boolean getstatusStage() {
        return statusStage;
    }
    public void setActive(boolean status) {
        this.statusStage = status;
    }
    
    
    public boolean getRetenir() {
        return retenir;
     }
    public void setRetenir(boolean Retenir) {
        this.retenir = Retenir;
    }
    
    
    public int getNumeroStage()
    {
       return numeroStage;
    }
    public void setnumeroStage(int NumeroStage){
        this.numeroStage = NumeroStage;
    }
}