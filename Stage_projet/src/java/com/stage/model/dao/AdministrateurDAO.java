package com.stage.model.dao;


import com.stage.model.entities.Administrateur;
import java.util.List;

/**
 *
 * @author phili
 */
public interface AdministrateurDAO {
    
    List<Administrateur> findAll();    
    Administrateur findById(int IdAdmin);
    Administrateur findByName(String NomAdmin);
    Administrateur existsByPassword(String PasswordAdmin);
}
