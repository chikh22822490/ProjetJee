package com.university.university.Controller;

import java.util.ArrayList;
import java.util.List;

import com.university.university.Entities.Departement;
import com.university.university.Entities.University;
import com.university.university.Interfaces.UniversityService;

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
@RequestMapping("/university")
@CrossOrigin(origins = "http://localhost:4200")
public class UniversityController {
    
    @Autowired
    UniversityService unS;

    @PostMapping("/AddUn")
    public University createUniversity(@RequestBody University un){
        /*if(un == null || un.getAdresseU() == null || un.getNomU() == null)
            return "Impossible d'ajouter l'université'";
        else{
            unS.saveUniversity(un);
            return "Le mise a jour a ete fait avec succes";
        }*/
        unS.saveUniversity(un);
        return un;
    }

    @GetMapping("/FindAll")
    public List<University> getAllUniversitys(){
        return unS.listUniversity();
    }

    @GetMapping(value="/FindUnId/{id}")
    public University findUniversity(@RequestBody @PathVariable(value = "id") String id){
        return unS.findUniversityById(Long.parseLong(id));
    }

    @DeleteMapping(value="/DeleteUnId/{id}")
    public String deleteUniversity(@RequestBody @PathVariable(value = "id") String id){
        unS.removeUniversity(Long.parseLong(id));
        return "University supprime avec succes";
    }

    @PutMapping("/updateUn/{id}")
    public String updateUniversity(@PathVariable(value = "id") String id,@RequestBody University un){
        University university= unS.findUniversityById(Long.parseLong(id));
        if(un == null || un.getAdresseU() == null || un.getNomU() == null)
            return "Impossible de faire la mise a jour";
        else{
            university.setAdresseU(un.getAdresseU());
            university.setDepartements(un.getDepartements());
            university.setNomU(un.getNomU());
            university.setImage(un.getImage());
            final University updateUniversity = unS.saveUniversity(university);
            ResponseEntity.ok(updateUniversity);
            return "La mise a jour a ete fait avec succes";
        }
    }
}
