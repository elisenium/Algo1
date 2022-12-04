public class DessinEtoile2 {

    public static Tortue tortue = new Tortue();
    
	public static void main(String args[]) {

        for (int i = 0; i < 6; i++) {
            tortue.accelerer();
            tortue.avancer(100);
            tortue.tournerAGauche(60);
            tortue.avancer(100);
            tortue.tournerADroite(120);
        }
	}
}