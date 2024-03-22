package FabriqueAbstraite.WarmBloodAnimal;

public class Oiseau implements WarmBlood{
    @Override
    public void produceHeat() {
        System.out.println("Fly Fly....");
    }
}
