public class RecitationTableMultiplication {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int table = unEntierAuHasardEntre(1, 10);
        int i = 0;
        int reponse;
        System.out.println("Tu vas donner la table de multiplication par " + table + " : ");

        do {
            i++;
            System.out.print(i + " x " + table + " = ");
            reponse = scanner.nextInt();
        } while (i < 10 && reponse == table * i);

        if (i == 10) {
            System.out.println("Félicitations, vous n'avez fait aucune erreur !");
        }
        else {
            System.out.println("Non c’est faux, la bonne réponse est " + i * table);
        }
    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }
}