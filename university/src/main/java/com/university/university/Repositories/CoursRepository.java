package com.university.university.Repositories;

import com.university.university.Entities.Cours;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CoursRepository extends JpaRepository <Cours,Long>{
    
    @Query(value = "select c from Cours c where codeC = ?1")
    Cours findByIdCours(long id);
}
