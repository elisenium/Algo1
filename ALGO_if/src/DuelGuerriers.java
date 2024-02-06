public class DuelGuerriers extends Guerrier{

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public String somethingnew;

	public DuelGuerriers(String name) {
		super(name);
		somethingnew = "surprise!";
	}

	public String toString() {
		return super.toString() + "\t" + somethingnew;
	}

	public static void main(String[] args) {

		//Nommer le guerrier 1
		System.out.println("Entrez le nom du premier guerrier : ");
		String guerrier1 = scanner.next();
		System.out.println("Le nom du premier guerrier est " + guerrier1);

		//Attribuer un nombre de vies au guerrier 1
		System.out.println("Entrez le nombre de vies de " + guerrier1 + " : ");
		int lancerDeguerrier1 = scanner.nextInt();

		//Nommer le guerrier 2
		System.out.println("Entrez le nom du second guerrier : ");
		String guerrier2 = scanner.next();
		System.out.println("Le nom du second guerrier est " + guerrier2);

		//Attribuer un nombre de vies au guerrier 2
		System.out.println("Entrez le nombre de vies de " + guerrier2 + " : ");
		int lancerDeguerrier2 = scanner.nextInt();

		int randomGuerrier = unEntierAuHasardEntre(0,1);

		//Pour le lancé de dé -> hasard
		/*int lancerDeguerrier1 = unEntierAuHasardEntre(1, 6);
		int lancerDeguerrier2 = unEntierAuHasardEntre(1, 6);*/

		if (randomGuerrier == 0) {
			System.out.println(guerrier1 + " lance le dé en premier");
			System.out.println(guerrier1 + " a " + lancerDeguerrier1 + " point(s) de vie");
			System.out.println(guerrier2 + " a " + lancerDeguerrier2 + " point(s) de vie");
		}
		else if (randomGuerrier == 1){
			System.out.println(guerrier2 + " lance le dé en premier");
			System.out.println(guerrier2 + " a " + lancerDeguerrier2 + " point(s) de vie");
			System.out.println(guerrier1 + " a " + lancerDeguerrier1 + " point(s) de vie");
		}

		int vieguerrier1 = lancerDeguerrier1 - lancerDeguerrier2;
		int vieguerrier2 = lancerDeguerrier2 - lancerDeguerrier1;

		if (lancerDeguerrier1 > lancerDeguerrier2) {
			System.out.println(guerrier1 + " inflige " + lancerDeguerrier1 + " point(s) de dégâts à " + guerrier2);

			if (vieguerrier2<0) {
				System.out.println(guerrier2 + " est mort");
			}
			else {
				System.out.println(guerrier2 + " a " + vieguerrier2 + " point(s) de vie");
			}
			System.out.println(guerrier1 + " est vainqueur");

		}
		else if (lancerDeguerrier1 == lancerDeguerrier2) {
			System.out.println(guerrier1 + " & " + guerrier2 + " s'infligent tous deux " + lancerDeguerrier1 + " point(s) de dégâts");
			System.out.println(guerrier1 + " & " + guerrier2 + " sont vainqueurs");
		}
		else {
			System.out.println(guerrier2 + " inflige " + lancerDeguerrier2 + " point(s) de dégâts à " + guerrier1);
			if (vieguerrier1<0) {
				System.out.println(guerrier1 + " est mort");
			}
			else {
				System.out.println(guerrier1 + " a " + vieguerrier1 + " point(s) de vie");
			}
			System.out.println(guerrier2 + " est vainqueur");
		}
	}

	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		return (int)((Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale);
	}
}