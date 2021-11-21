package com.university.university.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cours")
public class Cours {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeC;
    private String libelleC;

    @OneToMany(mappedBy = "coursSea")
    List<Seance> listSeances;

    public String getLibelleC() {
        return libelleC;
    }

    public void setLibelleC(String libelleC) {
        this.libelleC = libelleC;
    }

}
