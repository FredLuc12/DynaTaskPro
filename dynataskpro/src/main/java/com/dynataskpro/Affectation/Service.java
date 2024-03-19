
package com.dynataskpro.Affectation;

public class Service {

    private String nomService;
    private int numService;
    private int numDemande; 

    // Constructeur
    public Service(String nomService, int numService) {
        this.nomService = nomService;
        this.numService = numService;

    }

    public String getNomService() {
        return nomService;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }

    public int numService(int numService) {
        return numService;
    }

    public void setNumService(int numService) {
        this.numService = numService;
    }

    private int genererNumeroSuivi(int numDemande) {
        return numDemande;
    }

    public void estEnvoyéA(String nomService, int numDemande,int numService) {

        // Logique d'envoi de demande
        int numeroService = genererNumeroSuivi(numDemande);
        System.out.println ( "La demande: " + numDemande + "a été envoyé à: " + nomService + "dont le numéro est: " + numService);
    }

}
