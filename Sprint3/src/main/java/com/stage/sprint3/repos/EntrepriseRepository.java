package com.stage.sprint3.repos;

import com.stage.sprint3.entities.Entreprise;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntrepriseRepository extends CrudRepository <Entreprise, Integer> {
    public Long countByIdInc(Integer id);

    @Query("SELECT e FROM Entreprise e where e.nom like %?1%")
    public List<Entreprise> findAll(String keyword);

}
