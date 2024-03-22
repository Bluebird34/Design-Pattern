package monteur;

public class MonteurAvion_Bo747_White extends MonteurAvion{
    @Override
    public void creerNouvelleAvion() {
        this.avion.addCockpit();
        this.avion.addMoteur();
        this.avion.addAiles();
        this.avion.paint();
        this.avion.getAvionRepresentation();
    }
}
