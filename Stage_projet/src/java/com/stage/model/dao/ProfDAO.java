package com.stage.model.dao;

import com.stage.model.entities.Prof;
import java.util.List;

/**
 *
 * @author phili
 */
public interface ProfDAO {
    List<Prof> findAll();
    
      Prof findById(int IDProf);
      Prof findByName(String NomProf);
      Prof existsByPassword(String PasswordProf);
      boolean create(Prof prof);
    
}
