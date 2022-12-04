public class EntiersCroissantsDetector {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entrez l'entier 1 : ");
        int entier1 = scanner.nextInt();
        System.out.print("Entrez l'entier 2 : ");
        int entier2 = scanner.nextInt();
        System.out.print("Entrez l'entier 3 : ");
        int entier3 = scanner.nextInt();

        if (entier1 < entier2 && entier2 < entier3) {
            System.out.println("Ces trois nombres entiers ont été introduits par ordre croissant");
        }
        else {
            System.out.println("Ces trois nombres entiers n'ont pas été introduits par ordre croissant");
        }
    }
}