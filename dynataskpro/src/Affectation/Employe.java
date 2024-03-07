public class Employe implements Assignable{
    
    private Calendrier calendrier;
    private List<Competence> competences;

    public Employe(Calendrier calendrier, List<Competence> competences) {
        this.calendrier = calendrier;
        this.competences = competences;
    }

    @Override
    public void assignerTache(Tache tache) {
        // Logique d'assignation de tâche
    }
}
