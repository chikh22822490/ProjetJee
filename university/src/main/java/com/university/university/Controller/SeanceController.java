package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Seance;
import com.university.university.Interfaces.SeanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seance")
public class SeanceController {
    
    @Autowired
    SeanceService seaS;

    @PostMapping("/AddSea")
    public String createSeance(@RequestBody Seance sea){
        if(sea==null || sea.getDateS()==null)
            return "Impossible d'ajouter la séance";
        else{
            seaS.saveSeance(sea);
            return "L'ajout a ete fait avec succes";
        }
    }

    @GetMapping("/FindAll")
    public List<Seance> getAllSeances(){
        return seaS.listSeance();
    }

    @GetMapping(value="/FindSeaId/{id}")
    public Seance findSeance(@RequestBody @PathVariable(value = "id") String id){
        return seaS.findSeanceById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindSeaId/{id}")
    public String deleteSeance(@RequestBody @PathVariable(value = "id") String id){
        seaS.removeSeance(Long.parseLong(id));
        return "Seance supprime avec succes";
    }

    @PutMapping("/updateSea/{id}")
    public String updateSeance(@PathVariable(value = "id") String id, @RequestBody Seance sea){
        Seance seance = seaS.findSeanceById(Long.parseLong(id));
        if(sea==null || sea.getDateS()==null)
            return "Impossible de faire la mise a jour";
        else{
            seance.setDateS(sea.getDateS());
            final Seance updateSeance = seaS.saveSeance(seance);
            ResponseEntity.ok(updateSeance);
            return "Le mise a jour a ete fait avec succes";
        }
    }
}
