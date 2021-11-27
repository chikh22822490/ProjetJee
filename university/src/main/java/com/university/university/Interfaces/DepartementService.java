package com.university.university.Interfaces;

import java.util.List;

import com.university.university.Entities.Departement;

public interface DepartementService {
    
    Departement saveDepartement(Departement dt);
    void updateDepartement(Departement dt);
    List<Departement> listDepartement();
    void removeDepartement(long id);
    public Departement findDepartementById(long id);
}
