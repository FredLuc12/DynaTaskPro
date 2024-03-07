import java.util.List;

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
}
