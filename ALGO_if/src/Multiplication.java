public class Multiplication{

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("Entrainement aux multiplications. Voici un exercice :");
		
		int nombre1 = unEntierAuHasardEntre (0, 12);
		int nombre2 = unEntierAuHasardEntre (0, 12);
		System.out.println("Calculez : " + nombre1 + " x " + nombre2 + " = ");
		int reponse = scanner.nextInt();
		int produit = nombre1 * nombre2;
		
		if (reponse == produit) {
			System.out.print("Bravo !");
		}
		else {
			System.out.println(nombre1 + " x " + nombre2 + " = " + produit);
		}
	}

	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		return (int)((Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale);
	}
}