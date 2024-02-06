import static java.lang.Character.toLowerCase;

public class MultiplicationAuFinish {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Entrainement aux multiplications. Voici une multiplication :");
		System.out.println("Tant que tu n'as pas trouve la bonne reponse, tu dois la recommencer! ");

		int premierNombre = unEntierAuHasardEntre(0, 10);
		int secondNombre = unEntierAuHasardEntre(0, 10);

		int produit = premierNombre * secondNombre;
		int reponse;
		do {
			System.out.print("Calculez : " + premierNombre + " x " + secondNombre + " = ");
			reponse = scanner.nextInt();
			if (reponse != produit) {
				System.out.println("C’est faux, recommence");
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
