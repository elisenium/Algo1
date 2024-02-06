
/**
 * Championnat.java
 * @author Grelaud Elise
 * 
 */
public class Championnat {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
		int nombreFinalistes = 0;
		char reponse;
		do {
			double moyenne = resultatUnConcurrent();
			if (moyenne >= 8) {
				nombreFinalistes++;
				System.out.println("Le concurrent est selectionne pour la finale. Il y a " + nombreFinalistes + " finalistes pour le moment.");
			} else {
				System.out.println("Le concurrent n'est pas selectionne pour la finale. Il y a " + nombreFinalistes + " finalistes pour le moment.");

			}
			System.out.print("\nEncore un concurrent (O/N) ?");
			reponse = Utilitaires.lireOouN();

		} while (reponse == 'o' || reponse == 'O');
		System.out.println("Il y a " + nombreFinalistes + " finaliste(s) au championnat du monde de gymnastique.");
	}

	/**
	 * lit les cotes, calcule et renvoie le resultat d'un concurrent.
	 * Chaque concurrent est cote pour la presentation de son exercice, sur 10 points, par 8 membres du jury.
     * On elimine de ces cotes la plus haute et la plus basse. Le resultat d un concurrent est egal a�la moyenne des 6 cotes restantes.
	 * @return le resultat du concurrent
	*/
	public static double resultatUnConcurrent() {
		double moyenne = 0, cotesJury, coteMin = 10, coteMax = 0;

		for (int i = 1; i <= 8; i++) {
			System.out.print("Entrez la cote attribuee par le jury n° " + i + " : ");
			cotesJury = Utilitaires.lireReelComprisEntre(0, 10);
			moyenne += cotesJury;

			if (cotesJury > coteMax) {
				coteMax = cotesJury;
			}
			else if (cotesJury < coteMin) {
				coteMin = cotesJury;
			}
		}
		moyenne -= coteMin + coteMax;
		moyenne /= 6;
		System.out.println("\nLa cote du concurrent est de " + moyenne + "/10");
		return moyenne;
	}
}