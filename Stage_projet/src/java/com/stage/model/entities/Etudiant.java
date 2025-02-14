package com.stage.model.entities;

import java.io.Serializable;

public class Etudiant implements Serializable{
    private String nom;
    private String prenom;
    private int id;
    private boolean statusStage;
    private int numeroStage;
    private boolean retenir;
    private String password; 
    private String email;
   
    
    public Etudiant(String nom, String prenom, String email, String password){
        this.nom = nom ;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
    }
    
    public Etudiant(String nom, String prenom, boolean statusStage, String password, int id, boolean retenir, int NumeroStage){
        this.nom = nom ;
        this.prenom = prenom ;
        this.password = password;
        this.statusStage = statusStage; 
        this.id = id;
        this.retenir = retenir;
        this.numeroStage = NumeroStage;
    }
    
    public Etudiant(int id, String nom, String prenom, String email, boolean statusStage, int numeroStage, boolean retenir, String password){
        this.email = email;
        this.nom = nom ;
        this.prenom = prenom ;
        this.password = password;
        this.statusStage = statusStage; 
        this.id = id;
        this.retenir = retenir;
        this.numeroStage = numeroStage;
    }
    
    public Etudiant() {}

    
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    
    
    public String getNom(){
        return nom;
    }
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    
   public int getId()
    {
       return id;
    }
    public void setId(int da){
        this.id = da;
    }
    
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public boolean getStatusStage() {
        return statusStage;
    }
    public void setStatusStage(boolean statusStage) {
        this.statusStage = statusStage;
    }
    
    
    public boolean getRetenir() {
        return retenir;
     }
    public void setRetenir(boolean retenir) {
        this.retenir = retenir;
    }
    
    
    public int getNumeroStage()
    {
       return numeroStage;
    }
    public void setNumeroStage(int numeroStage){
        this.numeroStage = numeroStage;
    }
    
    public String getEmail()
    {
       return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
}