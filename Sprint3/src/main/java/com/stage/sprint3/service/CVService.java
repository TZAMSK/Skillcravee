package com.stage.sprint3.service;

import com.stage.sprint3.entities.CV;
import com.stage.sprint3.repos.CVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CVService {
    @Autowired
    public CVRepository cvRepo;

    public List<CV> afficherCV(){
        return (List<CV>) cvRepo.findAll();
    }
}
