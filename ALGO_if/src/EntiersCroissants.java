public class EntiersCroissants {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entrez l'entier 1 : ");
        int entier1 = scanner.nextInt();
        System.out.print("Entrez l'entier 2 : ");
        int entier2 = scanner.nextInt();

        //Introduction du if
        if (entier1 > entier2) {
            System.out.println(entier1 + ", " + entier2);
        }
        else {
            System.out.println(entier2 + ", " + entier1);
        }
    }
}