package com.stage.sprint3.service;

import com.stage.sprint3.entities.Emploi;
import com.stage.sprint3.repos.EmploiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmploiService {
    @Autowired
    private EmploiRepository emploiRepo;
    public List<Emploi> afficherEmplois(){
        return (List<Emploi>) emploiRepo.findAll();
    }
    public Emploi ajouterEmploi(Emploi emploi) { return emploiRepo.save(emploi);}
}
