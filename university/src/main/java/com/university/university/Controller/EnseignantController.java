package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Enseignant;
import com.university.university.Interfaces.EnseignantService;

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
@RequestMapping("/enseignant")
public class EnseignantController {
    
    @Autowired
    EnseignantService ensS;

    @PostMapping("/AddEns")
    public String createEnseignant(@RequestBody Enseignant ens){
        if(ens==null || ens.getAdresseE()==null || ens.getDiplomeE()==null || ens.getNomE()==null || ens.getPrenomE()==null)
            return "Impossible de faire l'ajout'";
        else{
            ensS.saveEnseignant(ens);
            return "L'ajout a ete fait avec succes";
        }
    }

    @GetMapping("/FindAll")
    public List<Enseignant> getAllEnseignants(){
        return ensS.listEnseignant();
    }

    @GetMapping(value="/FindEnsId/{id}")
    public Enseignant findEnseignant(@RequestBody @PathVariable(value = "id") String id){
        return ensS.findEnseignantById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindEnsId/{id}")
    public String deleteEnseignant(@RequestBody @PathVariable(value = "id") String id){
        ensS.removeEnseignant(Long.parseLong(id));
        return "Enseignant supprime avec succes";
    }

    @PutMapping("/updateEns/{id}")
    public String updateEnseignant(@PathVariable(value = "id") String id,@RequestBody Enseignant ens){
        Enseignant enseignant = ensS.findEnseignantById(Long.parseLong(id));
        if(ens==null || ens.getAdresseE()==null || ens.getDiplomeE()==null || ens.getNomE()==null || ens.getPrenomE()==null)
            return "Impossible de faire la mise a jour";
        else{
            enseignant.setAdresseE(ens.getAdresseE());
            enseignant.setDiplomeE(ens.getDiplomeE());
            enseignant.setNomE(ens.getNomE());
            enseignant.setPrenomE(ens.getPrenomE());
            final Enseignant updateEnseignant = ensS.saveEnseignant(enseignant);
            ResponseEntity.ok(updateEnseignant);
            return "Le mise a jour a ete fait avec succes";
        }
    }
}
