public class Multiplication1{

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Tu vas faire 5 multiplications");
		System.out.println("La valeur minimale des nombres a multiplier est 0, la valeur maximale est 10");
		System.out.println("Pour chaque multiplication, tu as droit a 1 essai");
		System.out.println("Tu recevras la reponse, si tu la rate");
		System.out.println("A la fin, le programme affichera le nombre de bonnes reponses.");
		// A NE PAS COMPLETER

		int compteur = 5;
		int partiesMax = 5;
		for (int i = 0; i < partiesMax; i++) {
			boolean correct = faireUneMultiplication();
			if(!correct){
				compteur -= 1;
			}
		}
		System.out.println("Tu as obtenu " + compteur + " bonnes réponses sur " + partiesMax + ".");
	}

	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;
		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
		return resultat;
	}

	public static boolean faireUneMultiplication() {
		System.out.println(" ");
		int nombre1 = unEntierAuHasardEntre(0,10);
		int nombre2 = unEntierAuHasardEntre(0,10);
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