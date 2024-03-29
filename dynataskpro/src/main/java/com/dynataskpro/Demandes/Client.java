package com.dynataskpro.Demandes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client {
    
    private String nom;
    private String prenom;
    private String email;
    private int numDemande;
    private String descriptionProjet;

    // Constructeur
    public Client(String nom, String prenom, String email, String descriptionDemande) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.descriptionProjet = descriptionProjet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescriptionProjet(){
        return descriptionProjet;
    }

    public void setDescriptionProjet(){
        this.descriptionProjet = descriptionProjet;
    }

    // Méthodes privées pour la génération de numéro de suivi et d'horodatage

    private int genererNumeroSuivi(int numDemande) {
        return numDemande;
    }

    private String genererHorodatage() {
        // Obtenez l'heure actuelle au format souhaité
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    public void envoyerDemande(int numDemande, String descriptionProjet) {
        // Logique d'envoi de demande
        int numeroSuivi = genererNumeroSuivi(numDemande);
        String horodatage = genererHorodatage();

        System.out.println("Demande envoyée par : " + prenom + " " + nom);
        System.out.println("Contenu de la demande : " + descriptionProjet);
        System.out.println("Numéro de suivi : " + numeroSuivi);
        System.out.println("Horodatage : " + horodatage);
    }

}

