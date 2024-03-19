package com.dynataskpro.Disponibilité;

public class AvailabilityServiceImpl implements Availability {

    private boolean disponibilite;

    // Constructeur
    public AvailabilityServiceImpl(boolean disponibiliteInitiale) {
        this.disponibilite = disponibiliteInitiale;
    }

    // Méthode pour mettre à jour la disponibilité
    @Override
    public void mettreAJourDisponibilite() {
        // Inverser la disponibilité actuelle
        disponibilite = !disponibilite;
        // Imprimer un message pour indiquer la nouvelle disponibilité
        System.out.println("La disponibilité a été mise à jour. Nouvelle disponibilité : " + disponibilite);
    }

    // Getter pour la disponibilité
    public boolean isDisponible() {
        return disponibilite;
    }

    // Setter pour la disponibilité si nécessaire
    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
}
