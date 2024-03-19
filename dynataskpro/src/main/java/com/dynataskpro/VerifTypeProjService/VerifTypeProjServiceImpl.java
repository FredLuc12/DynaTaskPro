package com.dynataskpro.VerifTypeProjService;

import com.dynataskpro.Demandes.Demand;

public class VerifTypeProjServiceImpl implements Verifiable {
    @Override
    public void verifieProjet(Demand demande) {
        // Vérifier si tous les champs du formulaire sont remplis
        if (demande.getNomProjet() == null || demande.getDescriptionProjet() == null) {
            // Si un champ est manquant, la demande est rejetée
            System.out.println("La demande de projet est incomplète. Veuillez remplir tous les champs et nous la renvoyée.");
            demande.setDemandeRejetee(true);
        } else {
            // Tous les champs sont remplis, la demande est acceptée
            System.out.println("La demande de projet est complète. Elle va etre prise en charge pour traitement.");
            demande.setDemandeRejetee(false);
        }
    }

    @Override
    public void effectuerVerification() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'effectuerVerification'");
    }
}
