package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Etudiant;
import com.university.university.Interfaces.EtudiantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    @Autowired
    EtudiantService etS;

    @PostMapping("/AddEt")
    public void createEtudiant(Etudiant et){
        etS.saveEtudiant(et);
    }

    @GetMapping("/FindAll")
    public List<Etudiant> getAllEtudiants(){
        return etS.listEtudiants();
    }

    @GetMapping(value="/FindEtId/{/id}")
    public Etudiant findEtudiant(@PathVariable(value = "id") String id){
        return etS.findEtudiantById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindEtId/{/id}")
    public String deleteEtudiant(@PathVariable(value = "id") String id){
        etS.removeEtudiant(Long.parseLong(id));
        return "Etudiant supprime avec succes";
    }

    @PutMapping("/updateEt/{/id}")
    public String updateEtudiant(@PathVariable(value = "id") String id, Etudiant et){
        if(et==null)
            return "Impossible de faire la mise a jour";
        else{
            etS.updateEtudiant(et);
            return "Le mise a jour a ete fait avec succes";
        }
    }
}
