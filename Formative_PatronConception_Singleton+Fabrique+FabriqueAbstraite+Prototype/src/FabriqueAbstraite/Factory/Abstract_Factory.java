package FabriqueAbstraite.Factory;

import FabriqueAbstraite.ColdBloodAnimal.ColdBlood;
import FabriqueAbstraite.WarmBloodAnimal.WarmBlood;

public abstract class Abstract_Factory {
    public abstract ColdBlood fabrique_ColdBlood(String ColdBloodType);
    public abstract WarmBlood fabrique_WarmBlood(String WarmBloodType);

}
