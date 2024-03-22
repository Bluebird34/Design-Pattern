package monteur;

public class Avion_Bo747_Blue extends Avion implements Couleur{
    @Override
    public void addCockpit() {
        new Cockpit_Bo747().getCockpitRepresentation();
    }

    @Override
    public void addMoteur() {
        new Moteur_Bo747().getMoteurRepresentation();
    }

    @Override
    public void addAiles() {
        new Ailes_Bo747().getAilesRepresentation();
    }

    @Override
    public void getAvionRepresentation() {
        System.out.println("Construction Avion bo747 blue terminé");
    }

    @Override
    public void paint() {
        System.out.println("Paint Avion bo747 coleur terminé, coloeur : " + couleur_2);
    }
}
