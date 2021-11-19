package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Departement;
import com.university.university.Interfaces.DepartementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departement")
public class DepartementController {
    
    @Autowired
    DepartementService dtS;

    @PostMapping("/AddDt")
    public void createDepartement(Departement dt){
        dtS.saveDepartement(dt);
    }

    @GetMapping("/FindAll")
    public List<Departement> getAllDepartements(){
        return dtS.listDepartement();
    }

    @GetMapping(value="/FindDtId/{/id}")
    public Departement findDepartement(@PathVariable(value = "id") String id){
        return dtS.findDepartementById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindDtId/{/id}")
    public String deleteDepartement(@PathVariable(value = "id") String id){
        dtS.removeDepartement(Long.parseLong(id));
        return "Departement supprime avec succes";
    }

    @PutMapping("/updateDt/{/id}")
    public String updateDepartement(@PathVariable(value = "id") String id, Departement dt){
        if(dt==null)
            return "Impossible de faire la mise a jour";
        else{
            dtS.updateDepartement(dt);
            return "Le mise a jour a ete fait avec succes";
        }
    }

}
