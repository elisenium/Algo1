import java.util.Scanner;

public class Losange {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez la taille (n) : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n/2; i++) {
            for (int j = 1; j <= n/2 - i; j++) {
                System.out.print("X");
            }
            for (int k = 0 ; k <= 2 * i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n/2 - i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

        for (int k = 0; k < n/2; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print("X");
            }
            for (int m = 1; m <= n - 2 * k - 2; m++) {
                System.out.print(" ");
            }
            for (int o = 0; o <= k; o++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}