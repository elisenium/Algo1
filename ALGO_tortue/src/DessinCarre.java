public class DessinCarre {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {

        for (var count = 0; count < 4; count++) {
            tortue.avancer(100);
            tortue.tournerADroite(90);
        }
    }
}