package monteur;

public abstract class Avion implements Toilettes {
    String cockpit;
    String moteur;
    String ailes;
    String couleur;

    public abstract void addCockpit();
    public abstract void addMoteur();
    public abstract void addAiles();
    public abstract void paint();

    public abstract void getAvionRepresentation();

    @Override
    public void getToilettesRepresentation() {
        System.out.println("Construction Toilettes terminé");
    }
}
