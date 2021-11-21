package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.University;
import com.university.university.Interfaces.UniversityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/university")
public class UniversityController {
    
    @Autowired
    UniversityService unS;

    @PostMapping("/AddUn")
    public void createUniversity(University un){
        unS.saveUniversity(un);
    }

    @GetMapping("/FindAll")
    public List<University> getAllUniversitys(){
        return unS.listUniversity();
    }

    @GetMapping(value="/FindUnId/{/id}")
    public University findUniversity(@PathVariable(value = "id") String id){
        return unS.findUniversityById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindUnId/{/id}")
    public String deleteUniversity(@PathVariable(value = "id") String id){
        unS.removeUniversity(Long.parseLong(id));
        return "University supprime avec succes";
    }

    @PutMapping("/updateUn/{/id}")
    public String updateUniversity(@PathVariable(value = "id") String id, University un){
        if(un==null&&un.getAdresseU()==null&&un.getNomU()==null)
            return "Impossible de faire la mise a jour";
        else{
            unS.updateUniversity(un);
            return "Le mise a jour a ete fait avec succes";
        }
    }
}
