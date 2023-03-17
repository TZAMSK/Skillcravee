package com.stage.chezbio.model.entities;

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
    
    
    public boolean statusStage() {
        return statusStage;
    }
    public void setActive(boolean status) {
        this.statusStage = status;
    }
    
    
    public boolean Retenir() {
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