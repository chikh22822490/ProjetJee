package com.university.university.Interfaces;

import java.util.List;

import com.university.university.Entities.Enseignant;

public interface EnseignantService {
    
    Enseignant saveEnseignant(Enseignant es);
    void updateEnseignant(Enseignant es);
    List<Enseignant> listEnseignant();
    void removeEnseignant(long id);
    public Enseignant findEnseignantById(long id);
}

