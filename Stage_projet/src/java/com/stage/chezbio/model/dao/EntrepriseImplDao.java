/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stage.chezbio.model.dao;

import com.stage.chezbio.model.entities.Administrateur;
import com.stage.chezbio.model.entities.Entreprise;
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
public class EntrepriseImplDao implements EntrepriseDAO {

    private static final String SQL_SELECT_INC = "select * from entreprise";
    private static final String SQL_SELECT_INC_BY_ID = "select * from entreprise where id = ?";
    private static final String SQL_SELECT_INC_BY_NAME = "select * from entreprise where nom = ?";
    private static final String SQL_CONNEXION_BY_EMAIL = "select nom from entreprise where email=?";

    @Override
    public List<Entreprise> findAll() {
        List<Entreprise> listeEntreprise = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_INC);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            listeEntreprise = new ArrayList<>();
            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                Entreprise entreprise = new Entreprise();
                entreprise.setIDInc(result.getInt("id"));
                entreprise.setNomInc(result.getString("nom"));
                entreprise.setTelephone(result.getInt("telephone"));
                entreprise.setContact(result.getString("contact"));
                entreprise.setemail(result.getString("email"));
                entreprise.setPasswordInc(result.getString("password"));

                listeEntreprise.add(entreprise);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EntrepriseImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return listeEntreprise;
    }

    @Override
    public Entreprise findById(int IDInc) {
        Entreprise entreprise = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_INC_BY_ID);
            // on initialise la propriété id du bean avec sa valeur
            ps.setInt(1, IDInc);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                entreprise = new Entreprise();
                entreprise.setIDInc(result.getInt("id"));
                entreprise.setNomInc(result.getString("nom"));
                entreprise.setTelephone(result.getInt("telephone"));
                entreprise.setContact(result.getString("contact"));
                entreprise.setemail(result.getString("email"));
                entreprise.setPasswordInc(result.getString("password"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(EntrepriseImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return entreprise;
    }

    @Override
    public Entreprise findByName(String NomInc) {
        Entreprise entreprise = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_INC_BY_NAME);
            // on initialise la propriété id du bean avec sa valeur
            ps.setString(1, NomInc);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                entreprise = new Entreprise();
                entreprise.setIDInc(result.getInt("id"));
                entreprise.setNomInc(result.getString("nom"));
                entreprise.setTelephone(result.getInt("telephone"));
                entreprise.setContact(result.getString("contact"));
                entreprise.setemail(result.getString("email"));
                entreprise.setPasswordInc(result.getString("password"));

            };
        } catch (SQLException ex) {
            Logger.getLogger(EntrepriseImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return entreprise;
    }

    @Override
    public Entreprise findByEmail(String Email) {
Entreprise entreprise = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_CONNEXION_BY_EMAIL);
            // on initialise la propriété id du bean avec sa valeur
            ps.setString(1, Email);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                entreprise = new Entreprise();
                entreprise.setIDInc(result.getInt("id"));
                entreprise.setNomInc(result.getString("nom"));
                entreprise.setTelephone(result.getInt("telephone"));
                entreprise.setContact(result.getString("contact"));
                entreprise.setemail(result.getString("email"));
                entreprise.setPasswordInc(result.getString("password"));

            };
        } catch (SQLException ex) {
            Logger.getLogger(EntrepriseImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return entreprise;    }

}
