package com.dynataskpro.Affectation;

import java.util.List;

public class Tache {
    
    private String nomTache;
    private String duree;
    private Employe employe;

    
    public Tache(String nomTache, String duree) {
        this.nomTache = nomTache;
        this.duree = duree;
    }

    public String getNomTache() {
        return nomTache;
    }

    public void setNomTache(String nomTache) {
        this.nomTache = nomTache;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public Employe getEmploye() {
        return employe;
    }
    
    
}
