import java.util.Scanner;

public class TriangleV3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez la taille (n) : ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("X");
            }
            System.out.println();
            for (int k = 0; k <= i; k++){
                System.out.print(" ");
            }
        }
    }
}