package com.dynataskpro.PlanVerifTypeProjet;

import java.util.List;

import com.dynataskpro.Demandes.Demand;
import com.dynataskpro.QualifProjetService.Qualifiable;
import com.dynataskpro.VerifTypeProjService.Verifiable;

public class Projet implements Verifiable, Qualifiable{
    
    private List<CritereVerification> listeCritereVerification;
    private String qualification;
    private String verification;

    public void genererPlanVerification() {
        // Logique de génération du plan de vérification
    }

    @Override
    public void evaluerQualification() {
        // Logique d'évaluation de la qualification
    }

    @Override
    public void effectuerVerification() {
        // Logique d'effectuation de la vérification
    }

    @Override
    public void verifieProjet(Demand demande) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verifieProjet'");
    }
}
