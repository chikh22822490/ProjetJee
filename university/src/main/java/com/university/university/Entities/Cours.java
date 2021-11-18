package com.university.university.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cours")
public class Cours {

    @Id @GeneratedValue
    private long codeC;
    private String libelleC;

    @OneToMany(mappedBy = "coursSea")
    List<Seance> listSeances;

}
