public class NombreMystere {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int nombreMystere = unEntierAuHasardEntre(0, 100);
        System.out.print("Entrez un nombre entier compris entre 0 et 100 : ");
        int nombreUtilisateur = scanner.nextInt();

        while (nombreMystere != nombreUtilisateur) {
            if (nombreUtilisateur > nombreMystere) {
                System.out.println("\nEntrez un plus petit nombre que " + nombreUtilisateur);
            } else if (nombreUtilisateur < nombreMystere) {
                System.out.println("\nEntrez un plus grand nombre que " + nombreUtilisateur);
            }
            System.out.print("Reessayez : ");
            nombreUtilisateur = scanner.nextInt();
        }

        if (nombreUtilisateur == nombreMystere) {
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