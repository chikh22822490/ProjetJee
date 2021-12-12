package com.university.university.Repositories;

import com.university.university.Entities.University;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UniversityRepository extends JpaRepository <University,Long>{
    
    @Query(value = "select u from University u where codeU = ?1")
    University findByIdUniversity(long id);
}
