package FabriqueAbstraite.Factory;

import FabriqueAbstraite.ColdBloodAnimal.Amphibien;
import FabriqueAbstraite.ColdBloodAnimal.ColdBlood;
import FabriqueAbstraite.ColdBloodAnimal.Reptile;
import FabriqueAbstraite.WarmBloodAnimal.Poisson;
import FabriqueAbstraite.WarmBloodAnimal.WarmBlood;

public class WarmBlood_Factory extends Abstract_Factory{
    @Override
    public ColdBlood fabrique_ColdBlood(String ColdBloodType) {
        return null;
    }

    @Override
    public WarmBlood fabrique_WarmBlood(String WarmBloodType) {
        switch (WarmBloodType) {
            case "poisson":
                return new Poisson();
            case "oiseau":
                return new Poisson();
            default:
                System.out.println("unknown species.....");
        }
        return null;
    }
}
