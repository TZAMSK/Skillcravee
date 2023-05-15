package com.stage.sprint3.repos;

import com.stage.sprint3.entities.CV;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVRepository extends CrudRepository<CV, Integer> {

}
