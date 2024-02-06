public class DessinXfor {
    public static Tortue tortue = new Tortue();

    public static void main(String args[]) {

        for (var count = 0; count < 4; count++) {
            tortue.tournerADroite(45);
            tortue.avancer(50);
            tortue.avancer(-50);
            tortue.tournerADroite(45);
        }
    }
}

