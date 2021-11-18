package com.university.university.Repositories;

import com.university.university.Entities.Seance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SeanceRepository extends JpaRepository <Seance,Long>{
    
    @Query(value = "select s from Seance s where codeS = ?1")
    Seance findByIdSeance(long id);
}
