package com.university.university.Services;

import java.util.List;

import com.university.university.Entities.Seance;
import com.university.university.Interfaces.SeanceService;
import com.university.university.Repositories.SeanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SeanceServiceImp")
public class SeanceServiceImp implements SeanceService{

    @Autowired
    SeanceRepository seaR;

    @Override
    public Seance saveSeance(Seance sea) {
        seaR.save(sea);   
        return(sea); 
    }

    @Override
    public void updateSeance(Seance sea) {
        seaR.save(sea);
    }

    @Override
    public List<Seance> listSeance() {
        return seaR.findAll();
    }

    @Override
    public void removeSeance(long id) {
        seaR.deleteById(id);
    }

    @Override
    public Seance findSeanceById(long id) {
        return seaR.findByIdSeance(id);
    }
    
}
