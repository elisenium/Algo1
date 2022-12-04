public class DessinPriseElectrique {

    public static Tortue tortue = new Tortue();
    public static void main(String[] args) {

    for (int i = 0; i < 360; i++) { 
        tortue.accelerer();
        tortue.avancer(2);
        tortue.tournerADroite(1);
        }

    tortue.tournerADroite(90);
    tortue.avancer(1);
    tortue.definirCouleur("NOIR");
    tortue.avancer(125);
    tortue.tournerADroite(90);
    tortue.avancer(50);

    for (int i = 0; i < 360; i++) {
        tortue.definirCouleur("BLANC");
        tortue.avancer(0.3);
        tortue.tournerADroite(1);
        }
    tortue.definirCouleur("NOIR");
    tortue.tournerADroite(180);
    tortue.avancer(100);

    for (int i = 0; i < 360; i++) {
        tortue.definirCouleur("BLANC");
        tortue.avancer(0.3);
        tortue.tournerAGauche(1);
        }
    }
}