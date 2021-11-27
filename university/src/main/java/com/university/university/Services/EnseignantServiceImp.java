package com.university.university.Services;

import java.util.List;

import com.university.university.Entities.Enseignant;
import com.university.university.Interfaces.EnseignantService;
import com.university.university.Repositories.EnseignantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EnseignantServiceImp")
public class EnseignantServiceImp implements EnseignantService{

    @Autowired
    EnseignantRepository esR;

    @Override
    public Enseignant saveEnseignant(Enseignant es) {
        esR.save(es);
        return(es);
    }

    @Override
    public void updateEnseignant(Enseignant es) {
        esR.save(es);
    }

    @Override
    public List<Enseignant> listEnseignant() {
        return esR.findAll();
    }

    @Override
    public void removeEnseignant(long id) {
        esR.deleteById(id);
    }

    @Override
    public Enseignant findEnseignantById(long id) {
        return esR.findByIdEnseignant(id);
    }
    
}
