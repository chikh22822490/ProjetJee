package com.university.university.Repositories;

import com.university.university.Entities.Etudiant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EtudiantRepository extends JpaRepository <Etudiant,Long>{
    
    @Query(value = "select e from Etudiant e where codeE = ?1")
    Etudiant findByIdEtudiant(long id);
}
