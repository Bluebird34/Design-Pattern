package monteur;

public class FabriqueAvion {
    MonteurAvion monteurAvion;
    public void setMonteurAvion(MonteurAvion monteurAvion) {
        this.monteurAvion = monteurAvion;
    }

    public void fabriqueAvion() {
        monteurAvion.creerNouvelleAvion();
    }
}
