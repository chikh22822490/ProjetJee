package com.university.university.Repositories;

import com.university.university.Entities.Enseignant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EnseignantRepository extends JpaRepository <Enseignant,Long>{
    
    @Query(value = "select e from Enseignant e where codeE = ?1")
    Enseignant findByIdEnseignant(long id);
}
