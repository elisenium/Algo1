public class AffichageTablesDeMultiplications {

    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {
            System.out.println();

            for (int j = 1; j <= 10 ; j++) {
                int multiplication = i * j;
                System.out.print("\t" + multiplication + " ");
            }
        }
    }
}