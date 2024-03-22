package monteur;

public abstract class MonteurAvion {
    protected Avion avion;
    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    public abstract void creerNouvelleAvion();
}
