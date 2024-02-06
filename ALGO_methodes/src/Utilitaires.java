public class Utilitaires {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    /**
     * genere un entier compris entre les 2 valeurs passees en parametre
     *
     * @param valeurMinimale la valeur minimale de l'entier genere
     * @param valeurMaximale la valeur maximale de l'entier genere
     * @return l'entier genere
     */
    public static int unEntierAuHasardEntre(int valeurMinimale, int valeurMaximale) {
        return (int) (Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
    }

    /**
     * lit un nombre reel positif ou nul
     *
     * @return un nombre reel positif
     */
    public static double lireReelPositif() {
        double x = scanner.nextDouble();
        while (x < 0) {
            System.out.println("Attention le reel doit etre positif");
            System.out.print("Recommencez : ");
            x = scanner.nextDouble();
        }
        return x;
    }


    public static int lireEntierNonNulPositif() {
        int x = scanner.nextInt();
        while (x == 0 && x < 0) {
            System.out.println("Attention l'entier doit etre positif non nul");
            System.out.print("Recommencez : ");
            x = scanner.nextInt();
        }
        return x;
    }


    /**
     * lit un nombre reel compris entre les 2 valeurs passees en parametre
     *
     * @param min le plus petit reel accepte
     * @param max le plus grand reel accepte
     * @return un nombre reel compris entre 2 bornes
     */
    public static double lireReelComprisEntre(double min, double max) {
        double x = scanner.nextDouble();
        while (x < min || x > max) {
            System.out.println("Attention le reel doit etre compris entre " + min + " et " + max);
            System.out.print("Recommencez : ");
            x = scanner.nextDouble();
        }
        if (x == min || x == max && x > min || x < max) {
            return x;
        }
        return lireReelComprisEntre(min, max);
    }


    /**
     * lit le caractere o ou n
     *
     * @return le caractere o un n
     */
    public static char lireOouN() {
        char x = scanner.next().charAt(0);
        while (x != 'o' && x != 'O' && x != 'n' && x != 'N') {
            System.out.println("Reponse non valide");
            System.out.println("Veuillez entrer une nouvelle réponse : ");
            x = scanner.next().charAt(0);
        }
        return x;
    }

    public static int max3(int entier1, int entier2, int entier3) {
        if (entier1 > entier2 && entier1 > entier3) {
            System.out.println("Le plus grand entier est " + entier1);
        } else {
            if (entier2 > entier3) {
                System.out.println("Le plus grand entier est " + entier2);
            } else {
                System.out.println("Le plus grand entier est " + entier3);
            }
        } return 0;
    }

    public static int donnerCommentaire(int cote){
        if (cote < 10){
            System.out.print("L'étudiant n'a pas validé l'UE");
        }
        else {
            if (10 <= cote && cote < 14) {
                System.out.print("L'étudiant a validé l'UE");
            }

            else if (14 <= cote && cote < 16) {
                System.out.print("L'étudiant a validé l'UE avec une belle cote");
            }
            else {
                System.out.print("L'étudiant a validé l'UE avec une très belle cote");
            }
        }
        return cote;
    }
}