package com.university.university.Controller;

import java.util.List;

import com.university.university.Entities.Etudiant;
import com.university.university.Interfaces.EtudiantService;

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
@RequestMapping("/etudiant")
public class EtudiantController {
    
    @Autowired
    EtudiantService etS;

    @PostMapping("/AddEt")
    public String createEtudiant(@RequestBody Etudiant et){
        if(et==null || et.getAdresseE()==null || et.getDateEntree()==null || et.getNomE()==null || et.getPrenomE()==null)
            return "Impossible de faire l'ajout";
        else{
            etS.saveEtudiant(et);
            return "L'ajout a ete fait avec succes";
        }
    }

    @GetMapping("/FindAll")
    public List<Etudiant> getAllEtudiants(){
        return etS.listEtudiants();
    }

    @GetMapping(value="/FindEtId/{id}")
    public Etudiant findEtudiant(@RequestBody @PathVariable(value = "id") String id){
        return etS.findEtudiantById(Long.parseLong(id));
    }

    @DeleteMapping(value="/FindEtId/{id}")
    public String deleteEtudiant(@RequestBody @PathVariable(value = "id") String id){
        etS.removeEtudiant(Long.parseLong(id));
        return "Etudiant supprime avec succes";
    }

    @PutMapping("/updateEt/{id}")
    public String updateEtudiant(@PathVariable(value = "id") String id,@RequestBody Etudiant et){
        Etudiant etudiant = etS.findEtudiantById(Long.parseLong(id));
        if(et==null || et.getAdresseE()==null || et.getDateEntree()==null || et.getNomE()==null || et.getPrenomE()==null)
            return "Impossible de faire la mise a jour";
        else{
            etudiant.setAdresseE(et.getAdresseE());
            etudiant.setDateEntree(et.getDateEntree());
            etudiant.setNomE(et.getNomE());
            etudiant.setPrenomE(et.getPrenomE());
            final Etudiant updateEtudiant = etS.saveEtudiant(etudiant);
            ResponseEntity.ok(updateEtudiant);
            return "Le mise a jour a ete fait avec succes";
        }
    }
}
