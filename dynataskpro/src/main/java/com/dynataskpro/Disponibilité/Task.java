package com.dynataskpro.Disponibilité;

public class Task implements Availability{

        private String nomTache;
        private String descriptionTache;
        private int numTache;
        private boolean isAvailable;


        @Override
        public void mettreAJourDisponibilite() {
            // Logic to update availability could be more complex here.
            isAvailable = !isAvailable; // This simply toggles the availability for demonstration.
            System.out.println("La disponibilité de la tâche " + nomTache + " est maintenant : " + isAvailable);
        }


        private boolean checkAvailability() {
            // Logic to check availability
            // This is just a placeholder. Replace with actual logic.
            return true;
        }

        // Constructeur
        public Task(String nomTache, String descriptionTache, int numTache) {
            this.nomTache = nomTache;
            this.descriptionTache = descriptionTache;
            this.numTache = numTache;
        }

        public String getNomTache() {
            return nomTache;
        }

        public void setNomTache(String nomTache) {
            this.nomTache = nomTache;
        }

        public String getDescriptionTache() {
            return descriptionTache;
        }

        public void setDescriptionTache(String descriptionTache) {
            this.descriptionTache = descriptionTache;
        }

        public int getNumTache() {
            return numTache;
        }

        public void setNumTache(int numTache) {
            this.numTache = numTache;
        }

        public void estEnvoyéA(String nomTache, int numTache) {
            System.out.println("Le numéro de la tâche :" + nomTache + " a été envoyé à la tâche " + numTache);
        }

}