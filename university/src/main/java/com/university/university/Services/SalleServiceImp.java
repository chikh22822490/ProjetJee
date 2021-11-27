package com.university.university.Services;

import java.util.List;

import com.university.university.Entities.Salle;
import com.university.university.Interfaces.SalleService;
import com.university.university.Repositories.SalleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SalleServiceImp")
public class SalleServiceImp implements SalleService{

    @Autowired
    SalleRepository saR;

    @Override
    public Salle saveSalle(Salle sa) {
        saR.save(sa);
        return(sa);
    }

    @Override
    public void updateSalle(Salle sa) {
        saR.save(sa);
    }

    @Override
    public List<Salle> listSalle() {
        return saR.findAll();
    }

    @Override
    public void removeSalle(long id) {
        saR.deleteById(id); 
    }

    @Override
    public Salle findSalleById(long id) {
        return saR.findByIdSalle(id);
    }
    
}
