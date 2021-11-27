package com.university.university.Interfaces;

import java.util.List;

import com.university.university.Entities.Etudiant;

public interface EtudiantService {
    
    Etudiant saveEtudiant(Etudiant et);
    void updateEtudiant(Etudiant et);
    List<Etudiant> listEtudiants();
    void removeEtudiant(long id);
    public Etudiant findEtudiantById(long id);
}
