package com.university.university.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Salle")
public class Salle {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeS;
    private String nomS;
    private long capaciteS;

    @OneToMany(mappedBy = "salleSea")
    List<Seance> listSeances;

    public Salle(){}

    public long getCapaciteS() {
        return capaciteS;
    }

    public void setCapaciteS(long capaciteS) {
        this.capaciteS = capaciteS;
    }

    public String getNomS() {
        return nomS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }
    
}
