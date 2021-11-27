package com.university.university.Services;

import java.util.List;

import com.university.university.Entities.Cours;
import com.university.university.Interfaces.CoursService;
import com.university.university.Repositories.CoursRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CoursServiceImp")
public class CoursServiceImp implements CoursService{

    @Autowired
    CoursRepository crR;
    
    @Override
    public Cours saveCours(Cours cr) {
        crR.save(cr);   
        return (cr); 
    }

    @Override
    public void updateCours(Cours cr) {
        crR.save(cr);        
    }

    @Override
    public List<Cours> listCours() {
        return crR.findAll();
    }

    @Override
    public void removeCours(long id) {
        crR.deleteById(id);
    }

    @Override
    public Cours findCoursById(long id) {
        return crR.findByIdCours(id);
    }
    
}
