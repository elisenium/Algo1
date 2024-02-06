import java.util.Scanner;

public class AfficherCalendrier {

    public static Scanner scanner = new Scanner(System.in);

    private final static String[] jours = {"Lu", "Ma", "Me", "Je", "Ve", "Sa", "Di"};

    public static void main(String [] args){
        int n, premierJourDuMois;

        do {
            System.out.print("Combien de jours il y a-t-il dans ce mois ? (28, 29, 30 ou 31) : ");
            n = scanner.nextInt();

        } while (n < 28 || n > 31);

        do {
            System.out.println("Quel est le premier jour du mois ? ");
            System.out.println();
            for (int i = 0; i < jours.length; i++) {
                System.out.println("Entrez '" + (i + 1) + "' si le premier jour commence un " + jours[i]);
            }
            premierJourDuMois = scanner.nextInt();

        } while (premierJourDuMois < 1 || premierJourDuMois > 7);

        Dates(n,premierJourDuMois);
    }
    private static void afficherJours() {
        for (String jour : jours) {
            System.out.print(jour + "\t");
        }
        System.out.print("\n");
    }

    private static void Dates(int nJours, int jour1) {
        afficherJours();
        jour1--;
        for (int i = 0; i < jour1; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= nJours; i++) {
            System.out.print(i + "\t");
            if ((i+jour1)%7 == 0) {
                System.out.print("\n");
            }
        }
        System.out.print("\n");
    }
}