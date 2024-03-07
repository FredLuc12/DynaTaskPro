package com.dynataskpro;

import com.dynataskpro.Demandes.Client;
import com.dynataskpro.Demandes.Demand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client client1 = new Client("Doe", "John", "john.doe@email.com");
        Demand demande1 = new Demand("ProjetA", "Description du projet A");
        client1.envoyerDemande(1,"Contenu de la demande 1");

        // Vous pouvez également utiliser les getters et setters
        System.out.println("Nom du client : " + client1.getNom());
        System.out.println("Prénom du client : " + client1.getPrenom());
        System.out.println("Email du client : " + client1.getEmail());
        System.out.println("Numéro de demande : " + demande1.getNumDemande());
        System.out.println("Nom du projet : " + demande1.getNomProjet());
        System.out.println("Description du projet : " + demande1.getDescriptionProjet());
    }
}
