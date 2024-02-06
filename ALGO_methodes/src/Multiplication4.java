
public class Multiplication4 {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Tu vas faire des multiplications de nombres compris entre 0 et 10");
		System.out.println("Tu peux choisir le nombre d'essais que tu auras pour chaque multiplication");
		System.out.println("Ce nombre sera le meme pour toutes les multiplications");
		System.out.println("Tu recevras la reponse, si tu ne l'as toujours pas trouvee au terme du nombre d'essais accorde");
		System.out.println("Apres chaque multiplication, le programme te demandera si tu en veux une autre");

		//A NE PAS COMPLETER

		System.out.print("\nCombien d'essais voulez-vous choisir ? ");
		int essai = scanner.nextInt();
		char reponse;

		do {
			faireUneMultiplication(essai);
			System.out.print("Encore un calcul (o/n) ? ");
			reponse = Utilitaires.lireOouN();
			} while (reponse == 'o' || reponse == 'O') ;
	}

	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;
		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
		return resultat;
	}

	public static void faireUneMultiplication(int essais) {
		int nombre1 = unEntierAuHasardEntre(0,10);
		int nombre2 = unEntierAuHasardEntre(0,10);
		int reponse = nombre1 * nombre2;
		System.out.print("Calculez : " + nombre1 + " x " + nombre2 + " = ");
		int reponseUtilisateur = scanner.nextInt();
		essais--;

		while (reponseUtilisateur != reponse && essais>0) {
			System.out.print("C'est faux, recommence : ");
			reponseUtilisateur = scanner.nextInt();
			essais--;
		}

		if (reponseUtilisateur == reponse) {
			System.out.println("Bien joue !");
		} else {
			System.out.println("Incorrect, la reponse etait " + reponse + "...");
		}
	}
}