package com.university.university.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Departement")
public class Departement {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeD;
    private String nomD;
    
    @ManyToMany
    List<University> university;

    @OneToMany(mappedBy =  "departementEns")
    private List<Enseignant> enseignants;

    public Departement(){}

    public String getNomD() {
        return nomD;
    }

    public void setNomD(String nomD) {
        this.nomD = nomD;
    }

}
