package com.university.university.Interfaces;

import java.util.List;

import com.university.university.Entities.Cours;

public interface CoursService {
    
    Cours saveCours(Cours cr);
    void updateCours(Cours cr);
    List<Cours> listCours();
    void removeCours(long id);
    public Cours findCoursById(long id);
}
