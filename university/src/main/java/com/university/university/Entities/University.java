package com.university.university.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "University")
public class University {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeU;
    private String nomU;
    private String adresseU;

    @ManyToMany(mappedBy = "university")
    List<Departement> departements;

    public University(){}
    
}
