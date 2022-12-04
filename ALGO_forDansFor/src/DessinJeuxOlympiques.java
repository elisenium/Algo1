public class DessinJeuxOlympiques {

    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();

        for (int i = 1; i <= 2; i++){
            Cercle();
            tortue.definirCouleur("NOIR");
            tortue.tournerADroite(90);
            tortue.avancer(60);
        }
        Cercle();
        for (int i = 1; i <= 2; i++){
            tortue.definirCouleur("NOIR");
            if (i == 1){
                tortue.tournerAGauche(90);
                Cercle();
            }
            else {
                tortue.tournerADroite(90);
                tortue.avancer(60);
                Cercle();
            }
        }
    }

    public static void Cercle() {
        tortue.definirCouleur("BLANC");
        for(int j = 0; j < 360; j++) {
            tortue.avancer(0.5);
            tortue.tournerADroite(1);
        }
    }
}