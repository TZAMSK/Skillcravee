/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import com.pkhalil.project.Prof;
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
