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
    private String image;

    @ManyToMany(mappedBy = "university")
    private List<Departement> departements;

    public University(){}

    public University(String nom,String adresse, String image, List<Departement> depats){
        this.nomU=nom;
        this.adresseU=adresse;
        this.image=image;
        this.departements=depats;
    }


    public long getCodeU() {
        return codeU;
    }

    public void setCodeU(long codeU) {
        this.codeU = codeU;
    }

    public List<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(List<Departement> departements) {
        this.departements = departements;
    }

    public String getAdresseU() {
        return adresseU;
    }

    public void setAdresseU(String adresseU) {
        this.adresseU = adresseU;
    }

    public String getNomU() {
        return nomU;
    }

    public void setNomU(String nomU) {
        this.nomU = nomU;
    }
    

    /**
     * @return String return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }



}
