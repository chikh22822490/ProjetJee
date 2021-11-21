package com.university.university.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Etudiant")
public class Etudiant {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeE;
    private String nomE;
    private String prenomE;
    private String adresseE;
    private Date dateEntree;

    @ManyToMany(mappedBy = "listEtudiants")
    List<Seance> listSeances;

    public Etudiant(){}

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public String getAdresseE() {
        return adresseE;
    }

    public void setAdresseE(String adresseE) {
        this.adresseE = adresseE;
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
