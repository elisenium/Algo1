public class NombreNegatifsParmi10 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int entier = 0 ;
        int nombreNegatifs = 0 - entier ;
        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Entrez l'entier n°" + i + " : ");
            entier = scanner.nextInt();
            if (entier < 0) {
                nombreNegatifs = nombreNegatifs + 1;
            }
        }
        System.out.println("Il y a " + nombreNegatifs + " nombres négatifs.");
    }
}