package com.stage.chezbio.model.dao;

import com.stage.chezbio.model.entities.Prof;
import java.util.List;

/**
 *
 * @author phili
 */
public interface ProfDAO {
    List<Prof> findAll();
    
      Prof findById(int IDProf);
      Prof findByName(String NomProf);
      Prof existsByPassword(char PasswordProf);
    
}
