package com.university.university.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Enseignant")
public class Enseignant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getAdresseE() {
        return adresseE;
    }

    public void setAdresseE(String adresseE) {
        this.adresseE = adresseE;
    }

    public String getDiplomeE() {
        return diplomeE;
    }

    public void setDiplomeE(String diplomeE) {
        this.diplomeE = diplomeE;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

}
