package com.stage.sprint3.repos;

import com.stage.sprint3.entities.Etudiant;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Integer> {
    public Long countById(Integer id);

    @Query("SELECT e FROM Etudiant e where e.nom like %?1% or e.prenom like %?1%")
    public List<Etudiant> findAll(String keyword);

    @Query("UPDATE Etudiant e set e.statusStage = ?2 where e.id = ?1")
    @Modifying
    public void updateStatus(Integer id, boolean statusStage);

    Etudiant findById(int id);


    @Query("SELECT e FROM Etudiant e where e.email like %?1% and e.password like %?2%")
    Etudiant findByEmailAndPassword(String email, String password);

}
