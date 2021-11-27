package com.university.university.Services;

import java.util.List;
import com.university.university.Entities.Etudiant;
import com.university.university.Interfaces.EtudiantService;
import com.university.university.Repositories.EtudiantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EtudiantServiceImp")
public class EtudiantServiceImp implements EtudiantService{

    @Autowired
    EtudiantRepository etR;

    @Override
    public Etudiant saveEtudiant(Etudiant et) {
        etR.save(et);
        return(et);
    }

    @Override
    public void updateEtudiant(Etudiant et) {
        etR.save(et);
    }

    @Override
    public List<Etudiant> listEtudiants() {
        return etR.findAll();
    }

    @Override
    public void removeEtudiant(long id) {
        etR.deleteById(id);
    }

    @Override
    public Etudiant findEtudiantById(long id) {
        return etR.findByIdEtudiant(id);
    }

    
}
