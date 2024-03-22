package FabriqueAbstraite.Factory;

import FabriqueAbstraite.ColdBloodAnimal.Amphibien;
import FabriqueAbstraite.ColdBloodAnimal.ColdBlood;
import FabriqueAbstraite.ColdBloodAnimal.Reptile;
import FabriqueAbstraite.WarmBloodAnimal.WarmBlood;

public class ColdBlood_Factory extends Abstract_Factory{
    @Override
    public ColdBlood fabrique_ColdBlood(String ColdBloodType) {
        switch (ColdBloodType) {
            case "reptile":
                return new Reptile();
            case "amphibien":
                return new Amphibien();
            default:
                System.out.println("unknown species.....");
        }
        return null;
    }

    @Override
    public WarmBlood fabrique_WarmBlood(String WarmBloodType) {
        return null;
    }
}
