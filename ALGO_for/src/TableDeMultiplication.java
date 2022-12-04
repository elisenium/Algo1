public class TableDeMultiplication {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int ligne = 1;
        ligne += 1;
        System.out.println("Quelle table de multiplication souhaitez-vous afficher ? ");
        int nombre = scanner.nextInt();
        System.out.println("La table de multiplication de " + nombre);

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + " x " + nombre + " = " + (nombre * i));
        }
    }
}