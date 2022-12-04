public class DessinLunettes {

    public static Tortue tortue = new Tortue();

    public static void main(String args[]) {

        tortue.definirCouleur("VERT");
        for (var count = 0; count < 4; count++) {
            
            tortue.avancer(100);
            tortue.tournerADroite(90);
        }

        tortue.avancer(-150);

        for (var count = 0; count < 4; count++) {
            tortue.avancer(100);
            tortue.tournerADroite(90);
        }
    }
}