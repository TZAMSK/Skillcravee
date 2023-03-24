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
    private String Password; 
    private String email;
    private long telephone;
    
   
    
    public Etudiant(String nom, String prenom, boolean status, String email, String password, int da, boolean Retenir, int NumeroStage){
        this.Nom = nom ;
        this.Prenom = prenom ;
        this.statusStage = status; 
        this.email = email;
        this.Password = password;
        this.DA = da;
        this.retenir = Retenir;
        this.numeroStage = NumeroStage;
    }

    public Etudiant() {
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
    
    
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }
    
}