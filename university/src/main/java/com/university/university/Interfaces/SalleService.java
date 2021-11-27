package com.university.university.Interfaces;

import java.util.List;

import com.university.university.Entities.Salle;

public interface SalleService {
    
    Salle saveSalle(Salle sa);
    void updateSalle(Salle sa);
    List<Salle> listSalle();
    void removeSalle(long id);
    public Salle findSalleById(long id);
}
