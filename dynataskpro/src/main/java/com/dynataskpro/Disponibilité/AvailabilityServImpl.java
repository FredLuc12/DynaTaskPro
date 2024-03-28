package com.dynataskpro.Disponibilité;

import java.util.HashSet;
import java.util.Set;

public class AvailabilityServImpl implements Availability {
    private Set<String> availableTeams;

    public AvailabilityServImpl() {
        // Initialisation des équipes disponibles
        availableTeams = new HashSet<>();
        availableTeams.add("Equipe1");
        availableTeams.add("Equipe2");
        availableTeams.add("Equipe3");
        // Ajoutez autant d'équipes que nécessaire
    }

    @Override
    public boolean isTeamAvailable(String teamName) {
        return availableTeams.contains(teamName);
    }
}
