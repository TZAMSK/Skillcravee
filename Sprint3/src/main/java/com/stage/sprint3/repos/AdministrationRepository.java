package com.stage.sprint3.repos;

import com.stage.sprint3.entities.Administration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrationRepository extends CrudRepository <Administration, Integer> {
}
