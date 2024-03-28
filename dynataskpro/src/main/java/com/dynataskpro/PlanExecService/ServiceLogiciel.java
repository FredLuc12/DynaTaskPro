package com.dynataskpro.PlanExecService;
import java.util.ArrayList;
import java.util.List;

import com.dynataskpro.Demandes.Demand;

public class ServiceLogiciel extends Service {

    private List<String> plansExecution; // Simule une liste de plans d'exécution
    
    public ServiceLogiciel() {
        this.plansExecution = new ArrayList<>();
    }

    @Override
    public void evaluerQualification() {
        // Logique d'évaluation de la qualification pour le service logiciel
        System.out.println("Évaluation de la qualification pour le service : " + getServiceName());
        // Ajoutez ici toute la logique spécifique à l'évaluation de la qualification pour le service logiciel
    }

    @Override
    public void effectuerVerification() {
        // Logique d'effectuation de la vérification pour le service logiciel
        System.out.println("Effectuation de la vérification pour le service : " + getServiceName());
        // Ajoutez ici toute la logique spécifique à l'effectuation de la vérification pour le service logiciel
    }

    public String getServiceName() {
        return "Service Logiciel";
    }

    @Override
    public void creerPlanExecution() {
        // Logique de création d'un plan d'exécution pour le service de construction
        String nouveauPlan = "Nouveau plan d'exécution";
        plansExecution.add(nouveauPlan); // Ajout du nouveau plan à la liste simulée
        System.out.println("Un nouveau plan d'exécution a été créé pour le service de construction : " + nouveauPlan);
    }

    @Override
    public void modifierPlanExecution() {
        // Logique de modification d'un plan d'exécution pour le service de construction
        if (!plansExecution.isEmpty()) {
            String planModifie = plansExecution.get(0); // Supposons que nous modifions le premier plan de la liste
            planModifie += " (modifié)"; // Modification factice du plan
            plansExecution.set(0, planModifie); // Mise à jour du plan dans la liste simulée
            System.out.println("Le plan d'exécution pour le service de construction a été modifié : " + planModifie);
        } else {
            System.out.println("Aucun plan d'exécution disponible pour la modification");
        }
    }

    @Override
    public void supprimerPlanExecution() {
        // Logique de suppression d'un plan d'exécution pour le service de construction
        if (!plansExecution.isEmpty()) {
            String planSupprime = plansExecution.remove(0); // Suppression du premier plan de la liste simulée
            System.out.println("Le plan d'exécution pour le service de construction a été supprimé : " + planSupprime);
        } else {
            System.out.println("Aucun plan d'exécution disponible pour la suppression");
        }
    }

    @Override
    public void consulterPlanExecution() {
        // Logique de consultation d'un plan d'exécution pour le service de construction
        System.out.println("Plans d'exécution pour le service de construction :");
        for (String plan : plansExecution) {
            System.out.println("- " + plan);
        }
    }

    @Override
    public void verifieProjet(Demand demande) {
        // Logique de vérification du projet pour le service de construction
        System.out.println("Vérification du projet pour le service de construction");
    }
}
