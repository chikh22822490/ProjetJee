package com.university.university.Services;

import java.util.List;

import com.university.university.Entities.University;
import com.university.university.Interfaces.UniversityService;
import com.university.university.Repositories.UniversityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniversityServiceImp")
public class UniversityServiceImp implements UniversityService{

    @Autowired
    UniversityRepository unR;
    @Override
    public University saveUniversity(University un) {
        unR.save(un);
        return(un);
    }

    @Override
    public void updateUniversity(University un) {
        unR.save(un);
    }

    @Override
    public List<University> listUniversity() {
        return unR.findAll();
    }

    @Override
    public void removeUniversity(long id) {
        unR.deleteById(id);
    }

    @Override
    public University findUniversityById(long id) {
        return unR.findByIdUniversity(id);
    }
    
}
