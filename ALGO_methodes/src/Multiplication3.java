
public class Multiplication3 {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Tu vas faire 5 multiplications");
		System.out.println("Au depart la valeur minimale des nombres a multiplier est 1 et la valeur maximale est 10");
		System.out.println("Ces 2 bornes augmenteront de 10 a chaque multiplication reussie");
		System.out.println("Pour chaque multiplication, tu as droit a 1 essai");
		System.out.println("Tu recevras la reponse, si tu la rate");
		// A NE PAS COMPLETER

		int valeurMax = 10;

		for (int i = 1; i<= 5; i++) {
			boolean essai = faireUneMultiplication(valeurMax);
			if (essai == true) {
				valeurMax += 10;
			} else {
				valeurMax += 0;
			}
		}
	}

	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;
		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
		return resultat;
	}

	public static boolean faireUneMultiplication(int valeurMax) {
		int nombre1 = unEntierAuHasardEntre(1,valeurMax);
		int nombre2 = unEntierAuHasardEntre(1,valeurMax);
		int reponse = nombre1 * nombre2;
		System.out.println();
		System.out.print("Calculez : " + nombre1 + " x " + nombre2 + " = ");
		int reponseUtilisateur = scanner.nextInt();

		if (reponseUtilisateur == reponse) {
			System.out.println("Bien joue !");
			return true;
		} else {
			System.out.println("Incorrect, la reponse etait " + reponse + "...");
			return false;
		}
	}
}