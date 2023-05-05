package com.stage.sprint3.repos;

import com.stage.sprint3.entities.Emploi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploiRepository extends CrudRepository <Emploi, Integer> {
}
