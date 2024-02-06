public class NombreMystereInverse {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Veuillez entrer votre nombre mystère compris entre 0 et 100 : ");
        int nombreMystere = scanner.nextInt();
        while (nombreMystere <= 0 || nombreMystere >= 100){
            System.out.println("Attention! Veuillez entrer un nombre compris entre 0 et 100 : ");
            nombreMystere = scanner.nextInt();
        }
        int nombreOrdinateur = unEntierAuHasardEntre(0,100);
        while (nombreMystere != nombreOrdinateur) {
            if (nombreOrdinateur > nombreMystere) {
                System.out.println("\nEntrez un plus petit nombre que " + nombreOrdinateur);
            } else if (nombreOrdinateur < nombreMystere) {
                System.out.println("\nEntrez un plus grand nombre que " + nombreOrdinateur);
            }
            nombreOrdinateur = unEntierAuHasardEntre(0,100);
        }
        if (nombreOrdinateur == nombreMystere) {
            System.out.println("\nVous avez trouvé le nombre mystère !");
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