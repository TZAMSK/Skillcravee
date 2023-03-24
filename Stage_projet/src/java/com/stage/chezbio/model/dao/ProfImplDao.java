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

public class ProfImplDao implements ProfDAO {

    private static final String SQL_SELECT_PROF = "select * from professeur";
    private static final String SQL_SELECT_PROF_BY_ID = "select * from professeur where id = ?";
    private static final String SQL_SELECT_PROF_BY_NAME = "select * from professeur where nom = ?";
    private static final String SQL_CONNEXION_BY_PASSWORD = "select nom, prenom from professeur where password=?";

    @Override
    public List<Prof> findAll() {
        List<Prof> listeProf = null;
        try {
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_PROF);
            System.out.println(" result : " + ps.toString());
            ResultSet result = ps.executeQuery();

            listeProf = new ArrayList<>();
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
        ConnexionBD.closeConnection();
        return listeProf;
    }

    @Override
    public Prof findById(int IDProf) {
        Prof prof = null;
        try {

            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_PROF_BY_ID);
            ps.setInt(1, IDProf);
            ResultSet result = ps.executeQuery();
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
        ConnexionBD.closeConnection();
        return prof;
    }

    @Override
    public Prof findByName(String NomProf) {
        Prof prof = null;
        try {
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_PROF_BY_NAME);
            ps.setString(1, NomProf);
            ResultSet result = ps.executeQuery();
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
        ConnexionBD.closeConnection();
        return prof;
    }

    @Override
    public Prof existsByPassword(String PasswordProf) {
        Prof prof = null;
        try {
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_CONNEXION_BY_PASSWORD);
            ps.setString(2, PasswordProf);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                prof = new Prof();
                
                prof.setNomProf(result.getString("nom"));
                prof.setPrenomProf(result.getString("prenom"));
             

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfImplDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnexionBD.closeConnection();
        return prof;
    }
}
