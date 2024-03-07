package com.dynataskpro.Demandes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client {
    
    private String nom;
    private String prenom;
    private String email;

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

    public void envoyerDemande(String contenuDemande) {
        // Logique d'envoi de demande
        String numeroSuivi = genererNumeroSuivi();
        String horodatage = genererHorodatage();

        System.out.println("Demande envoyée par : " + prenom + " " + nom);
        System.out.println("Contenu de la demande : " + contenuDemande);
        System.out.println("Numéro de suivi : " + numeroSuivi);
        System.out.println("Horodatage : " + horodatage);
    }

}

