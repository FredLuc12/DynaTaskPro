package com.dynataskpro.Demandes;

public class Demand {
    
    private static int compteurDemandes = 0;

    private int numDemande;
    private String nomProjet;
    private String descriptionProjet;
    private String serviceConcerne;
    private boolean demandeRejetee;
    

    // Constructeur
    public Demand(String nomProjet, String descriptionProjet, String ServiceConcerne) {
        this.numDemande = ++compteurDemandes;
        this.nomProjet = nomProjet;
        this.descriptionProjet = descriptionProjet;
        this.serviceConcerne = serviceConcerne;
    }

    // Méthode pour obtenir le numéro de demande
    public int getNumDemande() {
        return numDemande;
    }

    // Méthode pour obtenir le nom du projet
    public String getNomProjet() {
        return nomProjet;
    }

    // Méthode pour obtenir la description du projet
    public String getDescriptionProjet() {
        return descriptionProjet;
    }

    public String getServiceConcerne() {
        return serviceConcerne;
    }

    public boolean getDemandeRejetee(){
        return demandeRejetee;
    }

    public void setDemandeRejetee(boolean demandeRejetee){
        this.demandeRejetee = demandeRejetee;
    }
    
}

