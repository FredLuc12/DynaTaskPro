package com.dynataskpro.Demandes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client {
    
    private String nom;
    private String prenom;
    private String email;
    private int numDemande;

    // Constructeur
    public Client(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
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

    // Méthodes privées pour la génération de numéro de suivi et d'horodatage

    private String genererNumeroSuivi(int numDemande) {
        // Logique de génération de numéro de suivi (peut être une séquence unique, etc.)
        return numDemande;
    }

    private String genererHorodatage() {
        // Obtenez l'heure actuelle au format souhaité
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    public void envoyerDemande(int numDemande, String contenuDemande) {
        // Logique d'envoi de demande
        String numeroSuivi = genererNumeroSuivi(numDemande);
        String horodatage = genererHorodatage();

        System.out.println("Demande envoyée par : " + prenom + " " + nom);
        System.out.println("Contenu de la demande : " + contenuDemande);
        System.out.println("Numéro de suivi : " + numeroSuivi);
        System.out.println("Horodatage : " + horodatage);
    }

}

