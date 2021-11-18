package com.university.university.Repositories;

import com.university.university.Entities.Salle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SalleRepository extends JpaRepository <Salle,Long>{
    
    @Query(value = "select s from Salle s where codeS = ?1")
    Salle findByIdSalle(long id);
}
