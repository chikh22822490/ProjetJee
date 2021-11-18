package com.university.university.Entities;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Salle")
public class Salle {

    @Id @GeneratedValue
    private long codeS;
    private String nomS;
    private long capaciteS;

    @OneToMany(mappedBy = "salleSea")
    List<Seance> listSeances;

    public Salle(){}
    
}
