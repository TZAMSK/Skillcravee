/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import com.pkhalil.project.Etudiant;
import java.util.List;

/**
 *
 * @author phili
 */
public interface EtudiantDAO {
    List <Etudiant> findAll();
    
    Etudiant findById(int DA);
    Etudiant findByName(String Nom);
    Etudiant findByFirstName(String Prenom);
    Etudiant existsByPassword(char Password);
}
