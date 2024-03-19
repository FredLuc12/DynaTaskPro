package com.dynataskpro.Disponibilité;

public class AvailabilityServiceImpl implements Availability {
    
    private boolean disponibilite;

    // Constructeur
    public AvailabilityServiceImpl(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    // Méthode pour mettre à jour la disponibilité
    @Override
    public void mettreAJourDisponibilite() {
        // Mettre à jour la disponibilité selon la logique de votre choix
        // Par exemple, changer la disponibilité à true si elle était false et vice versa
        disponibilite = !disponibilite;
        System.out.println("La disponibilité a été mise à jour. Nouvelle disponibilité : " + disponibilite);
    }
}
