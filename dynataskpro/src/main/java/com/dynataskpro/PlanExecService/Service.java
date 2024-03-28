package com.dynataskpro.PlanExecService;

import com.dynataskpro.QualifProjetService.Qualifiable;
import com.dynataskpro.VerifTypeProjService.Verifiable;

public abstract class Service implements ServiceExecution, Verifiable, Qualifiable {
    protected String qualification;
    protected String verification;
    
    public abstract void evaluerQualification();

    public abstract void effectuerVerification();

    public String getServiceName() {
        if (this.getClass().equals(ServiceLogiciel.class)) {
            return getServiceName();
        } 
        if (this.getClass().equals(ServiceConstruction.class)) {
            return getServiceName();
        } else {
            return "Le service concerné n'est pas affecté";
        }
    }    
    
}