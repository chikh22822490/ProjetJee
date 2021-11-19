package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Cours;
import com.university.university.Interfaces.CoursService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cour")
public class CoursController {

    @Autowired
    CoursService crS;

    @PostMapping("/AddCr")
    public void createCours(Cours cr){
        crS.saveCours(cr);
    }

    @GetMapping("/FindAll")
    public List<Cours> getAllCourss(){
        return crS.listCours();
    }

    @GetMapping(value="/FindCrId/{/id}")
    public Cours findCours(@PathVariable(value = "id") String id){
        return crS.findCoursById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindCrId/{/id}")
    public String deleteCours(@PathVariable(value = "id") String id){
        crS.removeCours(Long.parseLong(id));
        return "Cours supprime avec succes";
    }

    @PutMapping("/updateCr/{/id}")
    public String updateCours(@PathVariable(value = "id") String id, Cours cr){
        if(cr==null)
            return "Impossible de faire la mise a jour";
        else{
            crS.updateCours(cr);
            return "Le mise a jour a ete fait avec succes";
        }
    }

}
