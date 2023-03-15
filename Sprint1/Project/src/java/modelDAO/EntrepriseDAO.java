/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import com.pkhalil.project.Entreprise;
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
}
