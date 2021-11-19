package com.university.university.Interfaces;

import java.util.List;

import com.university.university.Entities.University;

public interface UniversityService {
    
    void saveUniversity(University un);
    void updateUniversity(University un);
    List<University> listUniversitys();
    void removeUniversity(long id);
    public University findUniversityById(long id);
}
