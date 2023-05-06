package com.stage.sprint3.service;

import com.stage.sprint3.entities.Etudiant;
import com.stage.sprint3.repos.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepo;

    public List<Etudiant> afficherEtudiants(){
        return (List<Etudiant>) etudiantRepo.findAll();
    }
    public Etudiant ajouterEtudiant(Etudiant etudiant) { return etudiantRepo.save(etudiant);}

    public void supprimer(Integer id) {
        etudiantRepo.deleteById(id);
    }



    public List<Etudiant> rechercherEtudiantParNom(String keyword){
        if(keyword != null){
            return etudiantRepo.findAll(keyword);
        }
        return null;
    }

/*
    public void updateActive(Integer id, boolean enabled){
        etudiantRepo.updateActiveStat(id, enabled);
    }

 */

    public Etudiant get(Integer id){return etudiantRepo.findById(id).get();}
}
