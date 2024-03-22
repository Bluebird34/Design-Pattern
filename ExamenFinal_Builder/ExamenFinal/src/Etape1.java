public class Etape1 {
    public static int expIterative(int b, int e) {
        int result = 1;
        for(int i = 1; i <= e; i++) {
            result *= b;
        }
        return result;
    }

    public static int expRecursive(int b, int e) {
        if (e == 0) {
            return 1;
        } else {
            return b * expRecursive(b,e-1);
        }
    }

    public static void main(String[] args) throws Exception {
        int b = 2;
        int e = 10;
        System.out.println("Étape 1: Analyse asymptotique d’un algorithme");
        System.out.println("\nTEST DE L'ALGORITHME ITÉRATIF");
        System.out.println("Puissance de " + b + " à la puissance " + e + " est : " + expIterative(b, e));
        System.out.println("*************************************************************************");
        System.out.println("\nTEST DE L'ALGORITHME RÉCURSIF");
        System.out.println("Puissance de " + b + " à la puissance " + e + " est : " + expRecursive(b, e));
    }
}

