package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Departement;
import com.university.university.Interfaces.DepartementService;

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
@RequestMapping("/departement")
public class DepartementController {
    
    @Autowired
    DepartementService dtS;

    @PostMapping("/AddDt")
    public String createDepartement(@RequestBody Departement dt){
        if(dt==null || dt.getNomD()==null)
            return "Impossible de faire l'ajout";
        else{
            dtS.saveDepartement(dt);
            return "L'ajout a ete fait avec succes";
        }
    }

    @GetMapping("/FindAll")
    public List<Departement> getAllDepartements(){
        return dtS.listDepartement();
    }

    @GetMapping(value="/FindDtId/{id}")
    public Departement findDepartement(@RequestBody @PathVariable(value = "id") String id){
        return dtS.findDepartementById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindDtId/{id}")
    public String deleteDepartement(@RequestBody @PathVariable(value = "id") String id){
        dtS.removeDepartement(Long.parseLong(id));
        return "Departement supprime avec succes";
    }

    @PutMapping("/updateDt/{id}")
    public String updateDepartement(@PathVariable(value = "id") String id,@RequestBody Departement dt){
        Departement departement = dtS.findDepartementById(Long.parseLong(id));
        if(dt==null || dt.getNomD()==null)
            return "Impossible de faire la mise a jour";
        else{
            departement.setNomD(dt.getNomD());
            final Departement updateDepartement = dtS.saveDepartement(departement);
            ResponseEntity.ok(updateDepartement);
            return "Le mise a jour a ete fait avec succes";
        }
    }

}
