package com.university.university.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Enseignant")
public class Enseignant {

    @Id @GeneratedValue
    private long matricule;
    private String nomE;
    private String prenomE;
    private String adresseE;
    private String diplomeE;

    @OneToMany(mappedBy = "ensignantSea")
    List<Seance> listSeances;

    @ManyToOne
    private Departement departementEns;

    public Enseignant(){}

}
