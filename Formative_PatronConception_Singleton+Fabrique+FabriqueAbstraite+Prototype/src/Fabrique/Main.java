package Fabrique;

public class Main {
    public static void main(String[] args) {
      FabriqueAnimal fabriqueAnimal = new FabriqueAnimal();
      //if creerAnimal(type) is static, can't auto show here, need to ask why need to set as static?
      Animal animal1 = fabriqueAnimal.creerAnimal("chat");
      Animal animal2 = fabriqueAnimal.creerAnimal("lion");
      Animal animal3 = fabriqueAnimal.creerAnimal("chien");

      animal1.sound();
      animal2.sound();
      animal3.sound();
    }
}
