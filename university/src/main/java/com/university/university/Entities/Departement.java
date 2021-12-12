package com.university.university.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "Departement")
public class Departement {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeD;
    private String nomD;
    
    @ManyToMany
    List<University> university;

    @OneToMany(mappedBy =  "departementEns", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Enseignant> enseignants;

    public Departement(){}

    public Departement(long code, String nom){
        this.codeD=code;
        this.nomD=nom;
    }

    public String getNomD() {
        return nomD;
    }

    public void setNomD(String nomD) {
        this.nomD = nomD;
    }

}
