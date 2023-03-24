/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stage.chezbio.model.dao;

import com.stage.chezbio.model.entities.Administrateur;
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
public class AdminImplDao implements AdministrateurDAO {

    private static final String SQL_SELECT_ADMIN = "select * from administrateur";
    private static final String SQL_SELECT_ADMIN_BY_ID = "select * from administrateur where id = ?";
    private static final String SQL_SELECT_ADMIN_BY_NAME = "select * from administrateur where nom = ?";
    private static final String SQL_CONNEXION_BY_PASSWORD = "select nom, prenom from administrateur where password=?";

    @Override
    public List<Administrateur> findAll() {
        List<Administrateur> listeAdmin = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ADMIN);
            
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            listeAdmin = new ArrayList<>();
            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                Administrateur admin = new Administrateur();
                admin.setIdAdmin(result.getInt("id"));
                admin.setNomAdmin(result.getString("nom"));
                admin.setPrenomAdmin(result.getString("prenom"));
                admin.setPasswordAdmin(result.getString("password"));
                admin.setEmailAdmin(result.getString("email"));
                admin.setPasswordAdmin(result.getString("password"));

                listeAdmin.add(admin);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return listeAdmin;
    }

    @Override
    public Administrateur findById(int IdAdmin) {
        Administrateur admin = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ADMIN_BY_ID);
            // on initialise la propriété id du bean avec sa valeur
            ps.setInt(1, IdAdmin);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                admin = new Administrateur();
                admin.setIdAdmin(result.getInt("id"));
                admin.setNomAdmin(result.getString("nom"));
                admin.setPrenomAdmin(result.getString("prenom"));
                admin.setPasswordAdmin(result.getString("password"));
                admin.setEmailAdmin(result.getString("email"));
                admin.setPasswordAdmin(result.getString("password"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return admin;
    }

    @Override
    public Administrateur findByName(String NomAdmin) {
        Administrateur admin = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ADMIN_BY_NAME);
            // on initialise la propriété id du bean avec sa valeur
            ps.setString(1, NomAdmin);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                admin = new Administrateur();
                admin.setIdAdmin(result.getInt("id"));
                admin.setNomAdmin(result.getString("nom"));
                admin.setPrenomAdmin(result.getString("prenom"));
                admin.setPasswordAdmin(result.getString("password"));
                admin.setEmailAdmin(result.getString("email"));
                admin.setPasswordAdmin(result.getString("password"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return admin;
    }

    @Override
    public Administrateur existsByPassword(String PasswordAdmin) {
        Administrateur admin = null;
        try {

            //Initialise la requête préparée basée sur la connexion
            // la requête SQL passé en argument pour construire l'objet preparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_CONNEXION_BY_PASSWORD);
            // on initialise la propriété email du bean avec sa premiere valeur
            ps.setString(2, PasswordAdmin);
            //On execute la requête et on récupère les résultats dans la requête 
            // dans ResultSet
            ResultSet result = ps.executeQuery();

            //// la méthode next() pour se déplacer sur l'enregistrement suivant
            //on parcours ligne par ligne les résultas retournés
            while (result.next()) {
                admin = new Administrateur();
                admin.setNomAdmin(result.getString("nom"));
                admin.setPrenomAdmin(result.getString("prenom"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fermeture de toutes les ressources ouvertes
        ConnexionBD.closeConnection();
        return admin;
    }

}
