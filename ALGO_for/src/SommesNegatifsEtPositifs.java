public class SommesNegatifsEtPositifs {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int entier;
        int sommeNegatifs = 0;
        int sommePositifs =0 ;
        for (int i = 1; i <= 5 ; i++) {
            System.out.print("Entrez l'entier n°" + i + " : ");
            entier = scanner.nextInt();
            if (entier < 0) {
                sommeNegatifs = sommeNegatifs +  entier;
            }
            else if (entier > 0 || entier == 0) {
                sommePositifs = sommePositifs + entier;
            }
        }
        System.out.println("Somme des nombres positifs : " + sommePositifs);
        System.out.println("Somme des nombres négatifs : " + sommeNegatifs);
    }
}