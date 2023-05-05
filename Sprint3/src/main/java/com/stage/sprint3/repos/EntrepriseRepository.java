package com.stage.sprint3.repos;

import com.stage.sprint3.entities.Entreprise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends CrudRepository <Entreprise, Integer> {
}
