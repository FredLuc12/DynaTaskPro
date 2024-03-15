package com.dynataskpro.Affectation;



public class Service {
    
    private String nomService;
    private int numService;

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

}

