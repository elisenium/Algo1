public class Statistiques {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Entrez le nombre de cotes : ");
		int nombreCotes = scanner.nextInt();
		double coteMax = 0 ; // la plus petite cote possible
		double coteMin = Integer.MAX_VALUE ; //la cote la plus basse
		double sommecote = 0 ;

		for (int i = 1; i <= nombreCotes ; i++) {
			System.out.print("Entrez la cote n°" + i + " : ");
			double cote = scanner.nextDouble();
			sommecote = sommecote + cote;
			if (cote > coteMax){
				coteMax = cote;
			}
			if (cote < coteMin){
				coteMin = cote;
			}
		}

		double moyenne = sommecote/nombreCotes;
		System.out.println("La cote la plus élevée est "+ coteMax);
		System.out.println("La cote la plus basse est "+ coteMin);
		System.out.println("La moyenne s'élève à " + moyenne);
	}
}