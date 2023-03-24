/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stage.chezbio.model.dao;

import com.stage.chezbio.model.entities.Prof;
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
public class ProfImplDao implements ProfDAO {

    private static final String SQL_SELECT_PROF = "select * from prof";
    private static final String SQL_SELECT_PROF_BY_ID = "select * from prof where id = ?";
    private static final String SQL_SELECT_PROF_BY_NAME = "select * from prof where nom = ?";
    private static final String SQL_CONNEXION_BY_PASSWORD = "select nom, prenom from prof where password=?";

    @Override
    public List<Prof> findAll() {
        List<Prof> listeProf = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_PROF);
            System.out.println(" result : " + ps.toString());
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            listeProf = new ArrayList<>();
            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                Prof prof = new Prof();
                prof.setIDProf(result.getInt("id"));
                prof.setNomProf(result.getString("nom"));
                prof.setPrenomProf(result.getString("prenom"));
                prof.setEmailProf(result.getString("email"));
                prof.setPasswordProf(result.getString("password"));
                
                listeProf.add(prof);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return listeProf;
    }

    @Override
    public Prof findById(int IDProf) {
        Prof prof = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_PROF_BY_ID);
            // on initialise la propriété id du bean avec sa valeur
            ps.setInt(1, IDProf);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                prof = new Prof();
                prof.setIDProf(result.getInt("id"));
                prof.setNomProf(result.getString("nom"));
                prof.setPrenomProf(result.getString("prenom"));
                prof.setEmailProf(result.getString("email"));
                prof.setPasswordProf(result.getString("password"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return prof;
    }

    @Override
    public Prof findByName(String NomProf) {
        Prof prof = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_PROF_BY_NAME);
            // on initialise la propriété id du bean avec sa valeur
            ps.setString(1, NomProf);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                prof = new Prof();
                prof.setIDProf(result.getInt("id"));
                prof.setNomProf(result.getString("nom"));
                prof.setPrenomProf(result.getString("prenom"));
                prof.setEmailProf(result.getString("email"));
                prof.setPasswordProf(result.getString("password"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return prof;
    }

    @Override
    public Prof existsByPassword(String PasswordProf) {
        Prof prof = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_CONNEXION_BY_PASSWORD);
            // on initialise la propriété email du bean avec sa premiere valeur
            ps.setString(2, PasswordProf);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                prof = new Prof();
                
                prof.setNomProf(result.getString("nom"));
                prof.setPrenomProf(result.getString("prenom"));
             

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return prof;
    }
}
