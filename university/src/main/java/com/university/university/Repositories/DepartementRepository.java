package com.university.university.Repositories;

import com.university.university.Entities.Departement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepartementRepository extends JpaRepository <Departement,Long>{
    
    @Query(value = "select d from Departement d where codeD = ?1")
    Departement findByIdDepartement(long id);
}
