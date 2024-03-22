package Fabrique;

public class FabriqueAnimal {
    public Animal creerAnimal(String animalType) {
        switch(animalType) {
            case "chien":
                return new Chien();
            case "chat":
                return new Chat();
            case "lion":
                return new Lion();
            default:
                throw new IllegalArgumentException("Type d'animal inconnu");
        }
    }
}
