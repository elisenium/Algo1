public class DessinEtoile {

	public static Tortue tortue = new Tortue();
	
	public static void main(String args[]) {

		for (var count = 0; count < 3; count++) {

			tortue.definirCouleur("BLEU");
            tortue.avancer(300);
            tortue.tournerAGauche(120);
		}

		tortue.avancer(100);

		tortue.definirCouleur("ROUGE");
		tortue.tournerAGauche(120);
		tortue.avancer(200);

		for (var count = 0; count < 2; count++) {
			tortue.tournerADroite(120);
            tortue.avancer(300);
		}
		
		tortue.tournerADroite(120);
		tortue.avancer(100);
	}
}