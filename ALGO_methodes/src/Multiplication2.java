
public class Multiplication2 {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Tu vas faire des multiplications.");
		System.out.println("La valeur minimale des 2 nombres a multiplier est 0.");
		System.out.println("Tu peux choisir la valeur maximale de ces 2 nombres.");
		System.out.println("Cette valeur sera la meme pour tous les exercices");
		System.out.println("Pour chaque multiplication, tant que tu n'auras pas donne la bonne reponse, tu devras la recommencer");
		System.out.println("Le programme termine lorsque tu auras reussi 3 multiplications du premier coup");
	
		// A NE PAS COMPLETER

		System.out.print("Quelle valeur maximale souhaitez-vous choisir ? ");
		int valeurMax = scanner.nextInt();
		int reussi = 0;
		while (reussi != 3) {
			boolean essai = faireUneMultiplication(valeurMax);
			if (essai == true) {
				reussi ++;
			}
			else {
				reussi = 0;
			}
		}

		System.out.println("Bravo, tu as réussi 3 multiplications de suite !");
	}

	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;
		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
		return resultat;
	}

	public static boolean faireUneMultiplication(int valeurMax) {
		int nombre1 = unEntierAuHasardEntre(0,valeurMax);
		int nombre2 = unEntierAuHasardEntre(0,valeurMax);
		int reponse = nombre1 * nombre2;
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