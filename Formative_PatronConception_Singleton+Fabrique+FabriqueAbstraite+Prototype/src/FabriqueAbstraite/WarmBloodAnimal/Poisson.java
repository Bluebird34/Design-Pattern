package FabriqueAbstraite.WarmBloodAnimal;

public class Poisson implements WarmBlood{
    @Override
    public void produceHeat() {
        System.out.println("Swim in deep water....");
    }
}
