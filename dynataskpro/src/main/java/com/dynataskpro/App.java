package com.dynataskpro;

import com.dynataskpro.Affectation.Service;
import com.dynataskpro.Demandes.Client;
import com.dynataskpro.Demandes.Demand;
import com.dynataskpro.Disponibilité.Availability;
import com.dynataskpro.Disponibilité.AvailabilityServiceImpl;
import com.dynataskpro.VerifTypeProjService.VerifTypeProjServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client client1 = new Client("Doe", "John", "john.doe@email.com");
        Client client2 = new Client("Doe", "John", "john.doe@email.com");
        Demand demande1 = new Demand("ProjetA", "Description du projet A");
        // Créer une demande de projet avec un champ manquant (description du projet)
        Demand demandeIncomplete = new Demand("ProjetA", null);
        Service service1 = new Service("IA", 1);
        // Créer une instance de VerifTypeProjServiceImpl
        VerifTypeProjServiceImpl verifService = new VerifTypeProjServiceImpl();
        client1.envoyerDemande(1,"Contenu de la demande 1");
        client2.envoyerDemande(2, "null");
        service1.estEnvoyéA("A", 2, 2);
        Availability availabilityService = new AvailabilityServiceImpl(true);
        availabilityService.mettreAJourDisponibilite();

        // Instantiate the AvailabilityServiceImpl class
        AvailabilityServiceImpl availabilityServic = new AvailabilityServiceImpl(true); // Pass initial availability status

        // Use the mettreAJourDisponibilite method to update availability
        availabilityService.mettreAJourDisponibilite();

        // Use the isDisponible method to check current availability
        boolean isAvailable = availabilityServic.isDisponible();
        System.out.println("Current availability: " + isAvailable);

        // Use the setDisponibilite method to set availability
        availabilityServic.setDisponibilite(false); // Set availability to false

        // Tests
        System.out.println("Nom du client : " + client1.getNom());
        System.out.println("Prénom du client : " + client1.getPrenom());
        System.out.println("Email du client : " + client1.getEmail());
        System.out.println("Numéro de demande : " + demande1.getNumDemande());
        System.out.println("Nom du projet : " + demande1.getNomProjet());
        System.out.println("Description du projet : " + demande1.getDescriptionProjet());
        System.out.println("La demande: " + "" + demande1.getNumDemande() + "" + " a été envoyé au service: " + service1.getNomService());

        System.out.println("Nom du client : " + client2.getNom());
        System.out.println("Prénom du client : " + client2.getPrenom());
        System.out.println("Email du client : " + client2.getEmail());
        System.out.println("Numéro de demande : " + demandeIncomplete.getNumDemande());
        System.out.println("Nom du projet : " + demandeIncomplete.getNomProjet());
        System.out.println("Description du projet : " + demandeIncomplete.getDescriptionProjet());
        System.out.println("La demande: " + "" + demandeIncomplete.getNumDemande() + "" + " a été envoyé au service: " + service1.getNomService());

        // Vérifier la demande incomplète
        System.out.println("Vérification de la demande incomplète :");
        verifService.verifieProjet(demandeIncomplete);
        System.out.println("Demande rejetée ? " + demandeIncomplete.getDemandeRejetee());

        // Vérifier la demande complète
        System.out.println("\nVérification de la demande1 :");
        verifService.verifieProjet(demande1);
        System.out.println("Demande rejetée ? " + demande1.getDemandeRejetee());
    }
}
