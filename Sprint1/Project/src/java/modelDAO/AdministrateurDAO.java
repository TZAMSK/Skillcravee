/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import com.pkhalil.project.Administrateur;
import java.util.List;

/**
 *
 * @author phili
 */
public interface AdministrateurDAO {
    List<Administrateur> findAll();
    
    Administrateur findById(int IdAdmin);
    Administrateur findByName(String NomAdmin);
    Administrateur existsByPassword(char PasswordAdmin);
}
