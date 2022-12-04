public class DessinVentilateur {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();

        for (var count = 0; count < 3; count++) {
            for (var sides = 0; sides < 4; sides++) {
                tortue.avancer(100);
                tortue.tournerADroite(90);
            }
            tortue.tournerADroite(120);
        }
    }
}