package com.stage.sprint3.service;

import com.stage.sprint3.entities.Etudiant;
import com.stage.sprint3.entities.Prof;
import com.stage.sprint3.repos.ProfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProfService {

    @Autowired
    private ProfRepository profRepo;

    public List<Prof> afficherProfs(){
        return (List<Prof>) profRepo.findAll();
    }
    public Prof ajouterProf(Prof prof) { return profRepo.save(prof);}


    public void supprimer(Integer id) {
        profRepo.deleteById(id);
    }

    public List<Prof> rechercherProfParNom(String keyword){
        if(keyword != null){
            return profRepo.findAll(keyword);
        }
        return null;
    }
    public Prof findById(Integer id) {
        return profRepo.findById(id).orElse(null);
    }

    public Prof get(Integer id){return profRepo.findById(id).get();}

    public void updateProf(Prof prof) {
        Prof existingProf = profRepo.findById(prof.getIdProf());
        if (existingProf != null) {
            existingProf.setNom(prof.getNom());
            existingProf.setPrenom(prof.getPrenom());
            existingProf.setEmail(prof.getEmail());
            existingProf.setPassword(prof.getPassword());
            profRepo.save(existingProf);
        }
    }

    public Prof loginProf(String email, String password){
        if(email != null && password != null){
            return profRepo.findByEmailAndPassword(email, password);
        }
        return null;
    }
}
