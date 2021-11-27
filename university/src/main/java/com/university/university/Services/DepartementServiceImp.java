package com.university.university.Services;

import java.util.List;

import com.university.university.Entities.Departement;
import com.university.university.Interfaces.DepartementService;
import com.university.university.Repositories.DepartementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DepartementServiceImp")
public class DepartementServiceImp implements DepartementService{

    @Autowired
    DepartementRepository dtR;

    @Override
    public Departement saveDepartement(Departement dt) {
        dtR.save(dt);
        return(dt);
    }

    @Override
    public void updateDepartement(Departement dt) {
        dtR.save(dt);
    }

    @Override
    public List<Departement> listDepartement() {
        return dtR.findAll();
    }

    @Override
    public void removeDepartement(long id) {
        dtR.deleteById(id);
    }

    @Override
    public Departement findDepartementById(long id) {
        return dtR.findByIdDepartement(id);
    }
    
}
