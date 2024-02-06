//pas terminé

public class GamesOfIPL {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int nombreVies = 25;
        int lancerDeCognedur = unEntierAuHasardEntre(1, 6);
        int lancerDeFrappeFort = unEntierAuHasardEntre(1, 6);
        System.out.println("Bienvenue au combat entre Cognedur et Frappefort");
        do {
            nombreVies = nombreVies + 1;
            for (int i = 1; i<= nombreVies; i--) {
                System.out.println("Cognedur inflige " + lancerDeCognedur + " points de dégât à Frappefort");
                System.out.println("Il reste " + (nombreVies - (lancerDeCognedur+1)) + " points de vie à Frappefort");
                System.out.println("Frappefort inflige " + lancerDeFrappeFort + " points de dégât à Cognedur");
                System.out.println("Il reste " + (nombreVies - (lancerDeFrappeFort+1)) + " points de vie à Cognedur");
            }
        } while (nombreVies!=0);

    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        return (int)((Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale);
    }
}

