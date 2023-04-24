/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stage.model.dao;

import com.stage.model.entities.Administrateur;
import com.stage.model.singleton.ConnexionBD;
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

    private static final String SQL_SELECT_ADMIN = "select * from administration";
    private static final String SQL_SELECT_ADMIN_BY_ID = "select * from administration where id = ?";
    private static final String SQL_SELECT_ADMIN_BY_NAME = "select * from administration where nom = ?";
    private static final String SQL_CONNEXION_BY_PASSWORD = "select nom, prenom from administration where password=?";

    @Override
    public List<Administrateur> findAll() {
        List<Administrateur> listeAdmin = null;
        try {
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ADMIN);
            ResultSet result = ps.executeQuery();

            listeAdmin = new ArrayList<>();
            while (result.next()) {
                Administrateur admin = new Administrateur();
                admin.setIdAdmin(result.getInt("id"));
                admin.setNomAdmin(result.getString("nom"));
                admin.setPrenomAdmin(result.getString("prenom"));
                admin.setEmailAdmin(result.getString("email"));
                admin.setUsernameAdmin(result.getString("username"));
                admin.setPasswordAdmin(result.getString("password"));

                listeAdmin.add(admin);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnexionBD.closeConnection();
        return listeAdmin;
    }

    @Override
    public Administrateur findById(int IdAdmin) {
        Administrateur admin = null;
        try {

            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ADMIN_BY_ID);
            ps.setInt(1, IdAdmin);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                admin = new Administrateur();
                admin.setIdAdmin(result.getInt("id"));
                admin.setNomAdmin(result.getString("nom"));
                admin.setPrenomAdmin(result.getString("prenom"));
                admin.setEmailAdmin(result.getString("email"));
                admin.setUsernameAdmin(result.getString("username"));
                admin.setPasswordAdmin(result.getString("password"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnexionBD.closeConnection();
        return admin;
    }

    
    @Override
    public Administrateur findByName(String NomAdmin) {
        Administrateur admin = null;
        try {
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_ADMIN_BY_NAME);
            ps.setString(1, NomAdmin);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                admin = new Administrateur();
                admin.setIdAdmin(result.getInt("id"));
                admin.setNomAdmin(result.getString("nom"));
                admin.setPrenomAdmin(result.getString("prenom"));
                admin.setEmailAdmin(result.getString("email"));
                admin.setUsernameAdmin(result.getString("username"));
                admin.setPasswordAdmin(result.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnexionBD.closeConnection();
        return admin;
    }

    @Override
    public Administrateur existsByPassword(String PasswordAdmin) {
        Administrateur admin = null;
        try {
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_CONNEXION_BY_PASSWORD);
            ps.setString(2, PasswordAdmin);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                admin = new Administrateur();
                admin.setNomAdmin(result.getString("nom"));
                admin.setPrenomAdmin(result.getString("prenom"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnexionBD.closeConnection();
        return admin;
    }

}
