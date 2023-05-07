package com.stage.sprint3.repos;

import com.stage.sprint3.entities.Prof;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProfRepository extends CrudRepository<Prof, Integer> {
    public Long countByIdProf(Integer id);

    @Query("SELECT p FROM Prof p where p.nom like %?1% or p.prenom like %?1%")
    public List<Prof> findAll(String keyword);

    Prof findById(int id);
}
