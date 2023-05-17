package com.stage.sprint3.service;

import com.stage.sprint3.entities.Etudiant;
import com.stage.sprint3.repos.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepo;

    /*@Autowired
    private CVService cvService;*/

    public List<Etudiant> afficherEtudiants(){
        return (List<Etudiant>) etudiantRepo.findAll();
    }
    public Etudiant ajouterEtudiant(Etudiant etudiant) { return etudiantRepo.save(etudiant);}

    public void supprimer(Integer id) {
        etudiantRepo.deleteById(id);
    }

    public Etudiant findById(Integer id) {
        return etudiantRepo.findById(id).orElse(null);
    }

    public List<Etudiant> rechercherEtudiantParNom(String keyword){
        if(keyword != null){
            return etudiantRepo.findAll(keyword);
        }
        return null;
    }

    public void updateStatus(Integer id, boolean enabled){
        etudiantRepo.updateStatus(id, enabled);
    }

    public Etudiant get(Integer id){return etudiantRepo.findById(id).get();}

    public void updateEtudiant(Etudiant etudiant) {
        Etudiant existingEtudiant = etudiantRepo.findById(etudiant.getId());
        if (existingEtudiant != null) {
            existingEtudiant.setNom(etudiant.getNom());
            existingEtudiant.setPrenom(etudiant.getPrenom());
            existingEtudiant.setEmail(etudiant.getEmail());
            existingEtudiant.setPassword(etudiant.getPassword());
            etudiantRepo.save(existingEtudiant);
        }
    }
    public Etudiant loginEtudiant(String email, String password) {
        if (email != null && password != null) {
            return etudiantRepo.findByEmailAndPassword(email, password);
        }
        return null;
    }

}
