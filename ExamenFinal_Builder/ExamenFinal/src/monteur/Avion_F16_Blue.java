package monteur;

public class Avion_F16_Blue extends Avion implements Couleur {
    @Override
    public void addCockpit() {
        new Cockpit_F16().getCockpitRepresentation();
    }

    @Override
    public void addMoteur() {
        new Moteur_F16().getMoteurRepresentation();
    }

    @Override
    public void addAiles() {
        new Ailes_F16().getAilesRepresentation();
    }

    @Override
    public void getAvionRepresentation() {
        System.out.println("Construction Avion F16 blue terminé");
    }

    @Override
    public void paint() {
        System.out.println("Paint Avion F16 coleur terminé, coloeur : " + couleur_2);
    }
}
