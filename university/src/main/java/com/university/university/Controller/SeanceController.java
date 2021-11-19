package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Seance;
import com.university.university.Interfaces.SeanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seance")
public class SeanceController {
    
    @Autowired
    SeanceService seaS;

    @PostMapping("/AddSea")
    public void createSeance(Seance sea){
        seaS.saveSeance(sea);
    }

    @GetMapping("/FindAll")
    public List<Seance> getAllSeances(){
        return seaS.listSeance();
    }

    @GetMapping(value="/FindSeaId/{/id}")
    public Seance findSeance(@PathVariable(value = "id") String id){
        return seaS.findSeanceById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindSeaId/{/id}")
    public String deleteSeance(@PathVariable(value = "id") String id){
        seaS.removeSeance(Long.parseLong(id));
        return "Seance supprime avec succes";
    }

    @PutMapping("/updateSea/{/id}")
    public String updateSeance(@PathVariable(value = "id") String id, Seance sea){
        if(sea==null)
            return "Impossible de faire la mise a jour";
        else{
            seaS.updateSeance(sea);
            return "Le mise a jour a ete fait avec succes";
        }
    }
}
