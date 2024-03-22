package FabriqueAbstraite;

import FabriqueAbstraite.ColdBloodAnimal.ColdBlood;
import FabriqueAbstraite.Factory.Abstract_Factory;
import FabriqueAbstraite.Factory.Factory_Producer;
import FabriqueAbstraite.WarmBloodAnimal.WarmBlood;

public class Main {
    public static void main(String[] args) {

        Factory_Producer factoryProducer = new Factory_Producer();

        Abstract_Factory factory1 = factoryProducer.fabriqueFactory("warmblood");
        Abstract_Factory factory2 = factoryProducer.fabriqueFactory("coldblood");

        WarmBlood warmBlood1 = factory1.fabrique_WarmBlood("oiseau");
        ColdBlood coldBlood1 = factory2.fabrique_ColdBlood("reptile");

        warmBlood1.produceHeat();
        coldBlood1.SeekPlace();
    }
}
