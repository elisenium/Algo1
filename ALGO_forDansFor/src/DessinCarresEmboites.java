public class DessinCarresEmboites {
    public static Tortue tortue = new Tortue();

    public static void main(String args[]) {
        tortue.accelerer();

        for (var count = 1; count < 6; count++) {

            for (var sides = 0; sides < 4; sides++) {
                tortue.avancer(300 - 20*count);
                tortue.tournerADroite(90);
            }
        }
    }
}