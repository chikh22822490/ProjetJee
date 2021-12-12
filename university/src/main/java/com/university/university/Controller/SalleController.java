package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Salle;
import com.university.university.Interfaces.SalleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salle")
@CrossOrigin(origins = "http://localhost:4200")
public class SalleController {
    
    @Autowired
    SalleService saS;

    @PostMapping("/AddSa")
    public String createSalle(@RequestBody Salle sa){
        if(sa==null || sa.getCapaciteS()==0 || sa.getNomS()==null)
            return "Impossible de faire la mise a jour";
        else{
            saS.saveSalle(sa);
            return "L'ajout a ete fait avec succes";
        }
    }

    @GetMapping("/FindAll")
    public List<Salle> getAllSalles(){
        return saS.listSalle();
    }

    @GetMapping(value="/FindSaId/{id}")
    public Salle findSalle(@RequestBody @PathVariable(value = "id") String id){
        return saS.findSalleById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindSaId/{id}")
    public String deleteSalle(@RequestBody @PathVariable(value = "id") String id){
        saS.removeSalle(Long.parseLong(id));
        return "Salle supprime avec succes";
    }

    @PutMapping("/updateSa/{id}")
    public String updateSalle(@PathVariable(value = "id") String id, @RequestBody Salle sa){
        Salle salle = saS.findSalleById(Long.parseLong(id));
        if(sa==null || sa.getCapaciteS()==0 || sa.getNomS()==null)
            return "Impossible de faire la mise a jour";
        else{
            salle.setCapaciteS(sa.getCapaciteS());
            salle.setNomS(sa.getNomS());
            final Salle updateSalle = saS.saveSalle(salle);
            ResponseEntity.ok(updateSalle);
            return "Le mise a jour a ete fait avec succes";
        }
    }
}
