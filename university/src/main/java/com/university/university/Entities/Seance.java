package com.university.university.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Seance")
public class Seance {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeS;
    private Date dateS;
    
    @ManyToOne
    private Enseignant ensignantSea;

    @ManyToOne
    private Salle salleSea;

    @ManyToOne
    private Cours coursSea;

    @ManyToMany
    @JoinTable(
        name = "etudiant_seance",
        joinColumns = @JoinColumn(name = "id_etudiant"),
        inverseJoinColumns = @JoinColumn(name = "id_seance")
    )
    List<Etudiant> listEtudiants;

    public Seance(){}

    public Date getDateS() {
        return dateS;
    }

    public void setDateS(Date dateS) {
        this.dateS = dateS;
    }
    
}
