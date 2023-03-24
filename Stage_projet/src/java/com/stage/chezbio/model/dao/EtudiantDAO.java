package com.stage.chezbio.model.dao;

import com.stage.chezbio.model.entities.Etudiant;
import java.util.List;

/**
 *
 * @author phili
 */
public interface EtudiantDAO {
    
    List <Etudiant> findAll();   
    Etudiant findById(int DA);
    Etudiant findByName(String Nom);
    Etudiant findByEmail(String email);
    Etudiant existsByEmailAndPassword(String email, String password);
}
