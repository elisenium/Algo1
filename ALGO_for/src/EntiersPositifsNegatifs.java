public class EntiersPositifsNegatifs {

    public static java.util.Scanner Scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int positif = 0;
        int negatif = 0;

        for (int i = 1; i <= 2; i++) {

            System.out.print("Entrez le nombre entier " + i + " : ");
            int entier = Scanner.nextInt();

            if (entier > 0) {
                entier = entier + positif;
            }

            else if (entier < 0) {
                entier = entier + negatif;
            }

        }
        System.out.println("Les nombres en entiers positifs : " + positif);
        System.out.println("Les nombres en entiers négatifs : " + negatif);
    }
}
