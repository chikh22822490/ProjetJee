package com.university.university.Interfaces;

import java.util.List;

import com.university.university.Entities.Seance;

public interface SeanceService {
    
    Seance saveSeance(Seance sea);
    void updateSeance(Seance sea);
    List<Seance> listSeance();
    void removeSeance(long id);
    public Seance findSeanceById(long id);
}
