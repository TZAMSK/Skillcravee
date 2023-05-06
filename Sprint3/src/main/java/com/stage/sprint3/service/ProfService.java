package com.stage.sprint3.service;

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

    public Prof get(Integer id){return profRepo.findById(id).get();}
}
