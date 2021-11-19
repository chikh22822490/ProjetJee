package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Salle;
import com.university.university.Interfaces.SalleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salle")
public class SalleController {
    
    @Autowired
    SalleService saS;

    @PostMapping("/AddSa")
    public void createSalle(Salle sa){
        saS.saveSalle(sa);
    }

    @GetMapping("/FindAll")
    public List<Salle> getAllSalles(){
        return saS.listSalle();
    }

    @GetMapping(value="/FindSaId/{/id}")
    public Salle findSalle(@PathVariable(value = "id") String id){
        return saS.findSalleById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindSaId/{/id}")
    public String deleteSalle(@PathVariable(value = "id") String id){
        saS.removeSalle(Long.parseLong(id));
        return "Salle supprime avec succes";
    }

    @PutMapping("/updateSa/{/id}")
    public String updateSalle(@PathVariable(value = "id") String id, Salle sa){
        if(sa==null)
            return "Impossible de faire la mise a jour";
        else{
            saS.updateSalle(sa);
            return "Le mise a jour a ete fait avec succes";
        }
    }
}
