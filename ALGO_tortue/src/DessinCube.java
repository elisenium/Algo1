public class DessinCube {

    public static Tortue tortue = new Tortue();

    public static void main(String args[]) {

        for (var count = 0; count < 4; count++) {
            //tortue.accelerer();
            tortue.avancer(100);
            tortue.tournerADroite(90);
        }

        tortue.tournerAGauche(30);
        tortue.avancer(50);
        tortue.tournerADroite(30);
        tortue.avancer(100);
        tortue.tournerADroite(150);
        tortue.avancer(50);
        tortue.tournerAGauche(60);
        tortue.avancer(100);
        tortue.tournerAGauche(120);
        tortue.avancer(50);
        tortue.tournerAGauche(60);
        tortue.avancer(100);
    }
}
