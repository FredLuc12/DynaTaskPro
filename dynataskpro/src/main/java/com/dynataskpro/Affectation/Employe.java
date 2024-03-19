package com.dynataskpro.Affectation;

import java.util.Calendar;
import java.util.List;

public class Employe implements Assignable{
    private String nom;
    private String prenom;
    private String email;
    private List<Tache> tachesAssignes;

    
    private Calendar calendrier;
    private List<Competence> competences;

    public Employe(Calendar calendrier, List<Competence> competences) {
        this.calendrier = calendrier;
        this.competences = competences;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public void assignerTache(Tache tache) {
        tachesAssignes.add(tache);

    }
}
