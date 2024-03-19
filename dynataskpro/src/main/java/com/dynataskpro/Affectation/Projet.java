package com.dynataskpro.Affectation;

import java.util.List;

public class Projet implements Assignable {
    
    private List<Tache> listeTaches;
    private String nomProjet;
    private List<Employe> employes;


    public Projet(List<Tache> listeTaches) {
        this.listeTaches = listeTaches;
    }
    @Override
    public void assignerTache(Tache tache) {
        // Logique d'assignation de tâche dans le contexte du projet
        this.listeTaches.add(tache);

    }
    public List<Tache> getListeTaches() {
        return listeTaches;
    }
    public void setListeTaches(List<Tache> listeTaches) {
        this.listeTaches = listeTaches;
    }
    
}
