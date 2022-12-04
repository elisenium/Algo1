public class CotesAlgo_APOO {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrez votre cote sur 20 obtenue à l’examen d’Algo : ");
        int coteAlgo = scanner.nextInt();
        System.out.println("Entrez votre cote sur 20 obtenue à l’examen d’APOO : ");
        int coteAPOO = scanner.nextInt();

        if (0 <= coteAlgo && coteAlgo <= 20 && 0 <= coteAPOO && coteAPOO <= 20) {
            if (coteAlgo > coteAPOO){
                System.out.println("Cote obtenue à l'examen d'Algo : " + coteAlgo + "/20");
            }

            else if (coteAPOO > coteAlgo) {
                System.out.println("Cote obtenue à l'examen d'APOO : " + coteAPOO + "/20");
            }

            else if (coteAlgo == coteAPOO) {
                System.out.println("Cote obtenue à l'examen d'Algo : " + coteAlgo + "/20");
                System.out.println("Cote obtenue à l'examen d'APOO : " + coteAPOO + "/20");
            }
        }

        else {
            System.out.print("La cote entrée n'est pas valide");
        }
    }
}