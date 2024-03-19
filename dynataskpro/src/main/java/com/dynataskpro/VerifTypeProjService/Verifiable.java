package com.dynataskpro.VerifTypeProjService;

import com.dynataskpro.Demandes.Demand;

public interface Verifiable {
    void effectuerVerification();

    void verifieProjet(Demand demande);
}
