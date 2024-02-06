public class DessinMaison {
    
    public static Tortue tortue = new Tortue();

    public static void main(String args[]) {

        for (var count = 0; count < 4; count++) {
            tortue.avancer(100);
            tortue.tournerADroite(90);
        }

        for (var count = 0; count < 3; count++) {
            tortue.avancer(100);
            tortue.tournerAGauche(120);
        }
    }
}