package com.university.university.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Etudiant")
public class Etudiant {
    
    @Id @GeneratedValue
    private long codeE;
    private String nomE;
    private String prenomE;
    private String adresseE;
    private Date dateEntree;

    @ManyToMany(mappedBy = "listEtudiants")
    List<Seance> listSeances;

    public Etudiant(){}

}
