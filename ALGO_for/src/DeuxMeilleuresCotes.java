public class DeuxMeilleuresCotes {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int nbrExamens = 5, cote, coteMax1 = 0, coteMax2 = 0;

        for (int i = 1; i <= nbrExamens; i++) {
            System.out.print("Entrez votre cote de l'examen " + i + " : ");
            cote = scanner.nextInt();
            if (cote > coteMax1) {
                coteMax2 = coteMax1;
                coteMax1 = cote;
            } else if (cote > coteMax2) {
                coteMax2 = cote;
            }
        }
        System.out.print("Meilleure cote 1 : " + coteMax1 + "\nMeilleure cote 2 : " + coteMax2);
    }
}