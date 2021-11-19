package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Enseignant;
import com.university.university.Interfaces.EnseignantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enseignant")
public class EnseignantController {
    
    @Autowired
    EnseignantService ensS;

    @PostMapping("/AddEns")
    public void createEnseignant(Enseignant ens){
        ensS.saveEnseignant(ens);
    }

    @GetMapping("/FindAll")
    public List<Enseignant> getAllEnseignants(){
        return ensS.listEnseignant();
    }

    @GetMapping(value="/FindEnsId/{/id}")
    public Enseignant findEnseignant(@PathVariable(value = "id") String id){
        return ensS.findEnseignantById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindEnsId/{/id}")
    public String deleteEnseignant(@PathVariable(value = "id") String id){
        ensS.removeEnseignant(Long.parseLong(id));
        return "Enseignant supprime avec succes";
    }

    @PutMapping("/updateEns/{/id}")
    public String updateEnseignant(@PathVariable(value = "id") String id, Enseignant ens){
        if(ens==null)
            return "Impossible de faire la mise a jour";
        else{
            ensS.updateEnseignant(ens);
            return "Le mise a jour a ete fait avec succes";
        }
    }
}
