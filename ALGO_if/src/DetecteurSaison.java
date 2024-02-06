public class DetecteurSaison {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrez le jour : ");
        int jour = scanner.nextInt();
        System.out.println("Entrez le mois : ");
        int mois = scanner.nextInt();

        if ((21 <= jour && jour <= 31 && mois == 3)||
                (1 <= jour && jour <= 30 && mois == 4)||
                (1 <= jour && jour <= 31 && mois == 5)||
                (1 <= jour && jour <= 20 && mois == 6)){

            System.out.println(jour + "/" + mois + " -> printemps");
        }
        else if ((21 <= jour && jour <= 31 && mois == 6)||
                (1 <= jour && jour <= 31 && mois == 7 || mois == 8)||
                (1 <= jour && jour <= 20 && mois == 9)){

            System.out.println(jour + "/" + mois + " -> été");
        }
        else if ((21 <= jour && jour <= 30 && mois == 9)||
                (1 <= jour && jour <= 31 && mois == 10)||
                (1 <= jour && jour <= 30 && mois == 11)||
                (1 <= jour && jour <= 20 && mois == 12)){

            System.out.println(jour + "/" + mois + " -> automne");
        }
        else if ((21 <= jour && jour <= 31 && mois == 12)||
                (1 <= jour && jour <= 31 && mois == 1)||
                (1 <= jour && jour <= 28 && mois == 2)||
                (1 <= jour && jour <= 20 && mois == 3)) {

            System.out.println(jour + "/" + mois + " -> hiver");
        }
        else {
            System.out.println("Date invalide");
        }
    }
}