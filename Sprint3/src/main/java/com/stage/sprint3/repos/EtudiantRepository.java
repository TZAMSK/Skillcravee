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

    Etudiant findByAll(int id, String nom, String prenom, String email, String password, boolean statusStage, int numeroStage,boolean retenir);
}
