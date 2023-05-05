package com.stage.sprint3.repos;

import com.stage.sprint3.entities.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Integer> {
}
