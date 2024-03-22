package FabriqueAbstraite.Factory;

public class Factory_Producer {
    public Abstract_Factory fabriqueFactory(String choice) {
        switch (choice) {
            case "warmblood":
                return new WarmBlood_Factory();
            case "coldblood":
                return new ColdBlood_Factory();
            default:
                System.out.println("No such factory");
        }
        return null;
    }
}
