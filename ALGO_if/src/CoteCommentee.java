public class CoteCommentee {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrez votre cote obtenue sur 20 : ");
        int cote = scanner.nextInt();

        if (cote < 10){
            System.out.print("L'étudiant n'a pas validé l'UE");
        }

        else {
            if (10 <= cote && cote < 14) {
                System.out.print("L'étudiant a validé l'UE");
            }
            if (14 <= cote && cote < 16) {
                System.out.print("L'étudiant a validé l'UE avec une belle cote");
            }
            else if (16 <= cote && cote <= 20) {
                System.out.print("L'étudiant a validé l'UE avec une très belle cote");
            }
        }
    }
}