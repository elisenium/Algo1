public class DessinVentilateur {

    public static Tortue tortue = new Tortue();

    public static void main(String args[]) {

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 4; j++) {
                tortue.accelerer();
                tortue.avancer(100);
                tortue.tournerADroite(90);
            }

            tortue.tournerAGauche(120);
        }
    }
}