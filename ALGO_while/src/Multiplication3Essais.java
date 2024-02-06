public class Multiplication3Essais {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("Entrainement aux multiplications. Voici une multiplication :");
		System.out.println("Tu as droit a 3 essais");
		int premierNombre = unEntierAuHasardEntre (0, 10);
		int secondNombre = unEntierAuHasardEntre (0, 10);

		int produit = premierNombre * secondNombre;
		int reponse;
		int parties = 2;
		do {
			System.out.print("Calculez : " + premierNombre + " x " + secondNombre + " = ");
			reponse = scanner.nextInt();
			for (int i = 1; i <= 3; i ++) {
				if (reponse != produit) {
					System.out.print("Calculez : " + premierNombre + " x " + secondNombre + " = ");
					reponse = scanner.nextInt();
					if (i == parties) {
						System.out.println("Fin de la partie.");
						return; //Je ne voyais pas d'autre issue...
					}
				}
			}
		} while (reponse!=produit);
		System.out.println("Bravo !");
	}

	// A NE PAS MODIFIER
	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;

		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
		return resultat;
	}

}