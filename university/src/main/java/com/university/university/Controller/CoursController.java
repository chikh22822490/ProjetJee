package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Cours;
import com.university.university.Interfaces.CoursService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cour")
public class CoursController {

    @Autowired
    CoursService crS;

    @PostMapping("/AddCr")
    public String createCours(@RequestBody Cours cr){
        if(cr==null || cr.getLibelleC()==null)
            return "Impossible d'ajouter le cours";
        else{
            crS.saveCours(cr);
            return "Cours ajouté avec succès";
        }
    }

    @GetMapping("/FindAll")
    public List<Cours> getAllCours(){
        return crS.listCours();
    }

    @GetMapping(value="/FindCrId/{id}")
    public Cours findCours(@RequestBody @PathVariable(value = "id") String id){
        return crS.findCoursById(Long.parseLong(id));
    }

    @DeleteMapping(value="/DeleteCr/{id}")
    public String deleteCours(@RequestBody @PathVariable(value = "id") String id){
        crS.removeCours(Long.parseLong(id));
        return "Cours supprime avec succes";
    }

    @PutMapping("/updateCr/{id}")
    public String updateCours(@PathVariable(value = "id") String id,@Validated @RequestBody Cours cr){
        Cours cours = crS.findCoursById(Long.parseLong(id));
        if(cr==null || cr.getLibelleC()==null)
            return "Impossible de faire la mise a jour";
        else{
            cours.setLibelleC(cr.getLibelleC());
            final Cours updateCours = crS.saveCours(cours);
            ResponseEntity.ok(updateCours);
            return "Le mise a jour a ete fait avec succes";
        }
    }

}
