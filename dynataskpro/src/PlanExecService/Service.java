
public abstract class Service implements ServiceExecution, Verifiable, Qualifiable {
    protected String qualification;
    protected String verification;

    @Override
    public void evaluerQualification() {
        // Logique d'évaluation de la qualification pour les services généraux
    }

    @Override
    public void effectuerVerification() {
        // Logique d'effectuation de la vérification pour les services généraux
    }
}