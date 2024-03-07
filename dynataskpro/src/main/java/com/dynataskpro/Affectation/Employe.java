package com.dynataskpro.Affectation;

import java.util.Calendar;
import java.util.List;

public class Employe implements Assignable{
    private String nom;
    private String prenom;
    private String email;
    
    
    private Calendar calendrier;
    private List<Competence> competences;

    public Employe(Calendar calendrier, List<Competence> competences) {
        this.calendrier = calendrier;
        this.competences = competences;
    }

    @Override
    public void assignerTache(Tache tache) {
        // Logique d'assignation de tâche
    }
}
