package com.dynataskpro;

import com.dynataskpro.Affectation.Service;
import com.dynataskpro.Demandes.Client;
import com.dynataskpro.Demandes.Demand;
import com.dynataskpro.Disponibilité.Availability;
import com.dynataskpro.Disponibilité.AvailabilityServImpl;
import com.dynataskpro.VerifTypeProjService.VerifTypeProjServiceImpl;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        /*
        Client client1 = new Client("Doe", "John", "john.doe@email.com", "descriptionprojet");
        Client client2 = new Client("Doe", "John", "john.doe@email.com", "descriptionprojet");
        Demand demande1 = new Demand("ProjetA", "Description du projet A", "service");
        // Créer une demande de projet avec un champ manquant (description du projet)
        Demand demandeIncomplete = new Demand("ProjetA", null, null);
        Service service1 = new Service("IA", 1);
        // Créer une instance de VerifTypeProjServiceImpl
        VerifTypeProjServiceImpl verifService = new VerifTypeProjServiceImpl();
        client1.envoyerDemande(1,"Contenu de la demande 1");
        client2.envoyerDemande(2, "null");
        service1.estEnvoyéA("A", 2, 2);
        
        //Availability
         Availability availabilityService = new AvailabilityServImpl();

        // Simuler la récupération du projet
        String projectName = "Projet1";

        // Simuler la récupération des équipes disponibles
        String[] availableTeams = {"Equipe1", "Equipe2", "Equipe3"};

        // Vérifier la disponibilité des équipes
        for (String team : availableTeams) {
            if (availabilityService.isTeamAvailable(team)) {
                // Si une équipe est disponible, affecter le projet à cette équipe
                System.out.println("Le projet " + demande1.getNomProjet() + " est affecté à l'équipe " + team);
                return;
            }
        }

        // Si aucune équipe disponible n'est trouvée
        System.out.println("Aucune équipe disponible pour affecter le projet " + projectName);

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
        */
        //Tests

        // Création de la demande
        System.out.println("Une nouvelle mission a été envoyée. Voulez-vous créer une demande ? (Oui/Non)");
        String reponse = scanner.nextLine();
        if (reponse.equalsIgnoreCase("Oui")) {
            System.out.println("Entrez le nom du projet :");
            String nomProjet = scanner.nextLine();
            System.out.println("Entrez la description du projet :");
            String descriptionProjet = scanner.nextLine();
            
            // Choix du service
            System.out.println("À quel service souhaitez-vous transmettre la demande ?");
            System.out.println("1. Service Construction");
            System.out.println("2. Service Logiciel");
            int choixService = scanner.nextInt();
            
            if (choixService == 1) {
                // Envoi de la demande au service Construction
                System.out.println("La demande a été envoyée au service Construction.");
                System.out.println("Bienvenu dans le service Construction.");
                System.out.println("Souhaitez-vous créer votre plan d'exécution?");
                System.out.println("1. Oui");
                System.out.println("2. Non");
                int choix = scanner.nextInt();
                if(choix==1){
                    System.out.println("Votre plan d'éxécution a été créer, vous pouvez le supprimer, modifier, etc a tout moment");
                }else{
                    System.out.println("Merci et a bientot");
                }
                // Traitement supplémentaire pour le service Construction
            } else if (choixService == 2) {
                // Envoi de la demande au service Logiciel
                System.out.println("La demande a été envoyée au service Logiciel.");
                System.out.println("Bienvenu dans le service Logiciel.");
                System.out.println("Souhaitez-vous créer votre plan d'exécution?");
                // Traitement supplémentaire pour le service Logiciel
                System.out.println("1. Oui");
                System.out.println("2. Non");
                int choix = scanner.nextInt();
                if(choix==1){
                    System.out.println("Votre plan d'éxécution a été créer, vous pouvez le supprimer, modifier, etc a tout moment");
                }else{
                    System.out.println("Merci et a bientot");
                }
            } else {
                System.out.println("Choix de service invalide.");
            }
        } else {
            System.out.println("Demande non créée.");
        }
        
        scanner.close();
    }
}
