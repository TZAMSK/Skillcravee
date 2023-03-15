/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stage.chezbio.model.dao;

import com.stage.chezbio.model.entities.Administrateur;
import com.stage.chezbio.model.entities.Etudiant;
import com.stage.chezbio.model.singleton.ConnexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafaelfo
 */
public class EtudiantImplDao implements EtudiantDAO {

    private static final String SQL_SELECT_ETU = "select * from etudiant";
    private static final String SQL_SELECT_ETU_BY_ID = "select * from etudiant where id = ?";
    private static final String SQL_SELECT_ETU_BY_FIRST_NAME = "select * from etudiant where prenom = ?";
    private static final String SQL_SELECT_ETU_BY_NAME = "select * from etudiant where nom = ?";
    private static final String SQL_CONNEXION_BY_PASSWORD = "select nom, prenom from etudiant where password=?";

    @Override
    public List<Etudiant> findAll() {
        List<Etudiant> listeEtudiant = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ETU);

            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            listeEtudiant = new ArrayList<>();
            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                Etudiant etu = new Etudiant();
                etu.setDA(result.getInt("DA"));
                etu.setNom(result.getString("nom"));
                etu.setPrenom(result.getString("prenom"));
                etu.setPassword(result.getString("password"));
                etu.setEmail(result.getString("email"));
                etu.setTelephone(result.getLong("telephone"));

                listeEtudiant.add(etu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return listeEtudiant;
    }

    @Override
    public Etudiant findById(int DA) {
        Etudiant etu = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ETU_BY_ID);
            // on initialise la propriété id du bean avec sa valeur
            ps.setInt(1, DA);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                etu = new Etudiant();
                etu.setDA(result.getInt("DA"));
                etu.setNom(result.getString("nom"));
                etu.setPrenom(result.getString("prenom"));
                etu.setPassword(result.getString("password"));
                etu.setEmail(result.getString("email"));
                etu.setTelephone(result.getLong("telephone"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return etu;
    }

    @Override
    public Etudiant findByName(String nom) {
        Etudiant etu = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ETU_BY_NAME);
            // on initialise la propriété id du bean avec sa valeur
            ps.setString(1, nom);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                etu = new Etudiant();
                etu.setDA(result.getInt("DA"));
                etu.setNom(result.getString("nom"));
                etu.setPrenom(result.getString("prenom"));
                etu.setPassword(result.getString("password"));
                etu.setEmail(result.getString("email"));
                etu.setTelephone(result.getLong("telephone"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return etu;
    }

    @Override
    public Etudiant findByFirstName(String Prenom) {
        Etudiant etu = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ETU_BY_FIRST_NAME);
            // on initialise la propriété id du bean avec sa valeur
            ps.setString(1, Prenom);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                etu = new Etudiant();
                etu.setDA(result.getInt("DA"));
                etu.setNom(result.getString("nom"));
                etu.setPrenom(result.getString("prenom"));
                etu.setPassword(result.getString("password"));
                etu.setEmail(result.getString("email"));
                etu.setTelephone(result.getLong("telephone"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return etu;
    }

    @Override
    public Etudiant existsByPassword(String Password) {
        Etudiant etu = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_CONNEXION_BY_PASSWORD);
            // on initialise la propriété email du bean avec sa premiere valeur
            ps.setString(2, Password);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                etu = new Etudiant();
                etu.setNom(result.getString("nom"));
                etu.setPrenom(result.getString("prenom"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return etu;
    }

}
