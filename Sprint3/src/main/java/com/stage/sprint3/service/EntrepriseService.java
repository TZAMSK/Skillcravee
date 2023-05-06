package com.stage.sprint3.service;

import com.stage.sprint3.entities.Emploi;
import com.stage.sprint3.entities.Entreprise;
import com.stage.sprint3.repos.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EntrepriseService {

    @Autowired
    private EntrepriseRepository incRepo;
    @Autowired
    private EmploiService emploiService;

    public List<Entreprise> afficherEntreprises(){
        return (List<Entreprise>) incRepo.findAll();
    }
    public Entreprise ajouterEntreprise(Entreprise entreprise) { return incRepo.save(entreprise);}

    public void supprimer(Integer id) {
        incRepo.deleteById(id);
    }


    public List<Entreprise> rechercherEntrepriseParNom(String keyword){
        if(keyword != null){
            return incRepo.findAll(keyword);
        }
        return null;
    }


    public Entreprise get(Integer id){return incRepo.findById(id).get();}

    public List<Emploi> getEmploisByEntreprise(Entreprise entreprise) {
        List<Emploi> emploisByEntreprise = new ArrayList<>();
        List<Emploi> allEmplois = emploiService.afficherEmplois();
        for (Emploi emploi : allEmplois) {
            if (emploi.getEntreprise().equals(entreprise)) {
                emploisByEntreprise.add(emploi);
            }
        }
        return emploisByEntreprise;
    }

    public Entreprise findById(Integer id) {
        return incRepo.findById(id).orElse(null);
    }
}
