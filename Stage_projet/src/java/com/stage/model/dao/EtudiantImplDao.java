/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stage.model.dao;

import com.stage.model.entities.Etudiant;

import com.stage.model.singleton.ConnexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EtudiantImplDao implements EtudiantDAO {
    private static final String SQL_SELECT_ETUDIANT = "select * from etudiant";
    private static final String SQL_SELECT_ETUDIANT_PAR_ID = "select * from etudiant where id = ?";
    private static final String SQL_SELECT_ETUDIANT_PAR_NOM = "select * from etudiant where nom = ?";
    private static final String SQL_SELECT_ETUDIANT_PAR_EMAIL = "select * from utilisateurs where email = ?";
    private static final String SQL_CONNEXION_PAR_EMAIL_AND_PASSWORD = "select nom, prenom from etudiant where email=? and password=?";
    private static final String SQL_INSERT_ETUDIANT = "insert into etudiant (nom,prenom,email,password) value(?,?,?,?)";


    @Override
    public List<Etudiant> findAll() {
        List<Etudiant> listeEtudiant = null;
        try {
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ETUDIANT);
            System.out.println(" result : " + ps.toString());
            ResultSet result = ps.executeQuery();             
            listeEtudiant = new ArrayList<>();
            while (result.next()) {
                Etudiant etudiant = new Etudiant();
                etudiant.setId(result.getInt("id"));                
                etudiant.setNom(result.getString("nom"));
                etudiant.setPrenom(result.getString("prenom"));
                etudiant.setEmail(result.getString("email"));                
                etudiant.setStatusStage(result.getBoolean("statusStage"));
                etudiant.setNumeroStage(result.getInt("numeroStage"));
                etudiant.setRetenir(result.getBoolean("retenir"));
                etudiant.setPassword(result.getString("password"));

                listeEtudiant.add(etudiant);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnexionBD.closeConnection();
        return listeEtudiant;
    }

    @Override
    public Etudiant findById(int id) {
        Etudiant etudiant = null;
        try {
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ETUDIANT_PAR_ID);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                etudiant = new Etudiant();
                etudiant.setId(result.getInt("id"));                
                etudiant.setNom(result.getString("nom"));
                etudiant.setPrenom(result.getString("prenom"));
                etudiant.setEmail(result.getString("email"));                
                etudiant.setStatusStage(result.getBoolean("statusStage"));
                etudiant.setNumeroStage(result.getInt("numeroStage"));
                etudiant.setRetenir(result.getBoolean("retenir"));
                etudiant.setPassword(result.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnexionBD.closeConnection();
        return etudiant;
    }

    
    
    @Override
    public Etudiant findByName(String nom) {
        Etudiant etudiant = null;
        try {
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ETUDIANT_PAR_NOM);
            ps.setString(1, nom);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                etudiant = new Etudiant();
                etudiant.setId(result.getInt("id"));                
                etudiant.setNom(result.getString("nom"));
                etudiant.setPrenom(result.getString("prenom"));
                etudiant.setEmail(result.getString("email"));                
                etudiant.setStatusStage(result.getBoolean("statusStage"));
                etudiant.setNumeroStage(result.getInt("numeroStage"));
                etudiant.setRetenir(result.getBoolean("retenir"));
                etudiant.setPassword(result.getString("password"));               
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnexionBD.closeConnection();
        return etudiant;
    }

    @Override
    public Etudiant findByEmail(String email) {
        Etudiant etudiant = null;
        try {
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ETUDIANT_PAR_EMAIL);
            ps.setString(1, email);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                etudiant = new Etudiant();
                etudiant.setId(result.getInt("id"));                
                etudiant.setNom(result.getString("nom"));
                etudiant.setPrenom(result.getString("prenom"));
                etudiant.setEmail(result.getString("email"));                
                etudiant.setStatusStage(result.getBoolean("statusStage"));
                etudiant.setNumeroStage(result.getInt("numeroStage"));
                etudiant.setRetenir(result.getBoolean("retenir"));
                etudiant.setPassword(result.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnexionBD.closeConnection();
        return etudiant;
    }
      
    @Override
    public Etudiant existsByEmailAndPassword(String email, String motDePasse) {
        Etudiant etudiant = null;
        try {
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_CONNEXION_PAR_EMAIL_AND_PASSWORD);
            ps.setString(1, email);
            ps.setString(2, motDePasse); 
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                etudiant = new Etudiant();

                etudiant.setNom(result.getString("nom"));
                etudiant.setPrenom(result.getString("prenom"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return etudiant;
    }

    @Override
    public boolean create(Etudiant etudiant) {
        boolean retour = false;
        int nbLigne = 0;
        PreparedStatement ps;

        try {
            ps = ConnexionBD.getConnection().prepareStatement(SQL_INSERT_ETUDIANT);
            
            ps.setString(1, etudiant.getNom());
            ps.setString(2, etudiant.getPrenom());
            ps.setString(4, etudiant.getEmail());
            ps.setString(5, etudiant.getPassword());
            
            nbLigne = ps.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            Logger.getLogger(EtudiantImplDao.class.getName()).log(Level.SEVERE, null, e);
        }
        if (nbLigne > 0) {
            retour = true;
        }
        ConnexionBD.closeConnection();
        return retour;
    }
}