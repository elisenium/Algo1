import java.util.Scanner;

public class TriangleV1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez la taille (n) : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}