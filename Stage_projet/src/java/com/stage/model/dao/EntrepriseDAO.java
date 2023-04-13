package com.stage.model.dao;

import com.stage.model.entities.Entreprise;
import java.util.List;

/**
 *
 * @author phili
 */
public interface EntrepriseDAO {
    List<Entreprise> findAll();
    Entreprise findById (int IDInc);
    Entreprise findByName(String NomInc);
    Entreprise findByEmail(String Email);  
    boolean create(Entreprise entreprise);
    
}
