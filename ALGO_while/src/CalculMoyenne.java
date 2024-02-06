import static java.lang.Character.toLowerCase;

public class CalculMoyenne {

    public static java.util.Scanner Scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int cote = 0;
        double moyenne = 0;
        char nouvelleCote;
        do {
            System.out.print("Entrez la cote n°" + (cote + 1) + " : ");
            moyenne = moyenne + Scanner.nextDouble();
            System.out.println("Voulez-vous entrer une autre cote ? (Y/N) ou (O/N)");
            nouvelleCote = toLowerCase(Scanner.next().charAt(0));
            cote++;
        }
        while (nouvelleCote == 'Y' || nouvelleCote == 'y' ||nouvelleCote == 'O' || nouvelleCote == 'o');
        moyenne = moyenne / (cote-1);
        System.out.println("Votre moyenne s'élève à " + moyenne + ".");
    }
}