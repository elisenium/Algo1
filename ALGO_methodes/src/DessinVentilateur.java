public class DessinVentilateur {

    public static void main(String[] args) {
        Tortue tortue = new Tortue();
        for (int i = 0; i <= 3; i++) {
            tortue.tournerAGauche(120);
            tortue.dessinerUnCarre(100);
        }
    }
}
