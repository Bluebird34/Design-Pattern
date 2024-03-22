package monteur;

public class GestionAvions {
    public static void main(String[] args) throws Exception {
        System.out.println("Étape 2: Patrons de conception Monteur");
        // Faites appel à qui de droit pour créer vos avions

        //Create Avion
        Avion avion_F16_Whilte = new Avion_F16_White();
        Avion avion_F16_Blue = new Avion_F16_Blue();
        Avion avion_Bo747_Whilte = new Avion_Bo747_White();
        Avion avion_Bo747_Blue = new Avion_Bo747_Blue();

        //Create monteur d'avion et DI avec avion
        MonteurAvion monteurAvion_F16_White = new MonteurAvion_F16_White();
        MonteurAvion monteurAvion_F16_Blue = new MonteurAvion_F16_Blue();
        MonteurAvion monteurAvion_Bo747_White = new MonteurAvion_Bo747_White();
        MonteurAvion monteurAvion_Bo747_Blue = new MonteurAvion_Bo747_Blue();

        monteurAvion_F16_White.setAvion(avion_F16_Whilte);
        monteurAvion_F16_Blue.setAvion(avion_F16_Blue);
        monteurAvion_Bo747_White.setAvion(avion_Bo747_Whilte);
        monteurAvion_Bo747_Blue.setAvion(avion_Bo747_Blue);

        //Create un fabrique et fabrique avion respectivement
        FabriqueAvion fabriqueAvion = new FabriqueAvion();

        fabriqueAvion.setMonteurAvion(monteurAvion_F16_White);
        fabriqueAvion.fabriqueAvion();

        System.out.println("**************************************");

        fabriqueAvion.setMonteurAvion(monteurAvion_F16_Blue);
        fabriqueAvion.fabriqueAvion();

        System.out.println("**************************************");

        fabriqueAvion.setMonteurAvion(monteurAvion_Bo747_White);
        fabriqueAvion.fabriqueAvion();

        System.out.println("**************************************");

        fabriqueAvion.setMonteurAvion(monteurAvion_Bo747_Blue);
        fabriqueAvion.fabriqueAvion();

        }
}
