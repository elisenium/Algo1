public class CoteCommenteeV2 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrez votre cote obtenue sur 20 : ");
        int cote = scanner.nextInt();
        Utilitaires.donnerCommentaire(cote);
    }
}