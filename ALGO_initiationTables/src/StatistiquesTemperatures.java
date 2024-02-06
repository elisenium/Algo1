import java.util.Arrays;

public class StatistiquesTemperatures {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);
	public static Temperatures temperatures;
	
	public static void main(String[] args) {
		
		chargerTemperatures();
		System.out.println(temperatures.toString());
		
		System.out.println("*****************************");
		System.out.println("Temperatures : statistiques :");
		System.out.println("*****************************");
		int choix;
		do{
			System.out.println();
			System.out.println("1 -> afficher toutes les temperatures");	
			System.out.println("2 -> calculer la moyenne");
			System.out.println("3 -> afficher la température minimale");
			System.out.println("4 -> afficher la température maximale");
			System.out.println("5 -> afficher le nombre de jours de gel");
			System.out.println("6 -> afficher les jours de gel");
			System.out.println("7 -> toutes les températures sont-elles positives?");
			System.out.println("8 -> il y a-t-il au moins un jour de gel ?");
			System.out.println("9 -> il y a-t-il au moins une température supérieure à ...");
			System.out.println("10 -> afficher les jours avec la température la plus élevée");
			System.out.println("11 -> afficher les jours avec la température la plus basse");
			System.out.println();
			System.out.print("Entrez votre choix : ");	
			choix=scanner.nextInt();
			switch(choix){	
			case 1: afficherTout();   
			break;
			case 2: afficherMoyenne();   
			break;
			case 3: afficherTemperatureMin();
			break;
			case 4: afficherTemperatureMax();
			break;
			case 5: afficherNombreJoursDeGel();
			break;
			case 6: afficherJoursDeGel();
			break;
			case 7: afficherToutesPositives();
			break;
			case 8: afficherContientAuMoinsUnJoursDeGel();
			break;
			case 9: afficherContientAuMoinsUneTemperatureSuperieureA();
			break;
			case 10: afficherJoursMax();
			break;
			case 11: afficherJoursMin();
			break;
			}
		}while(choix >=1 && choix<=11);
	}
	
	private static void afficherTout() {
		System.out.println(temperatures.toString());
	}

	private static void afficherMoyenne() {
		System.out.println(temperatures.moyenne());
	}

	public static void chargerTemperatures(){
		double[]tableTemperatures = {-1,1,0,1,-1,-3,-3,-2,0,-1,0,1,1,3,5,4,2,0,1,1,5,3,2,0,-1,0,1,1,3,4,5};
		temperatures = new Temperatures("janvier",tableTemperatures);
	}

	private static void afficherTemperatureMin(){
		System.out.println("La température minimale est : " + temperatures.temperatureMin() + " °C");
	}

	private static void afficherTemperatureMax(){
		System.out.println("La température maximale est : " + temperatures.temperatureMax() + " °C");
	}

	private static void afficherNombreJoursDeGel(){
		System.out.println("Il y a " + temperatures.nombreJoursDeGel() + " jours de gel");
	}

	private static void afficherJoursDeGel(){
		System.out.println("Les jours sont : " + Arrays.toString(temperatures.joursDeGel()));
	}

	private static void afficherToutesPositives(){
		System.out.println(temperatures.toutesPositives());
	}

	private static void afficherContientAuMoinsUnJoursDeGel(){
		System.out.println(temperatures.contientAuMoinsUnJoursDeGel());
	}

	private static void afficherContientAuMoinsUneTemperatureSuperieureA(){
		System.out.println(temperatures.contientAuMoinsUneTemperatureSuperieureA(5));
	}

	private static void afficherJoursMax(){
		System.out.println(Arrays.toString(temperatures.joursMax()));
	}

	private static void afficherJoursMin(){
		System.out.println(Arrays.toString(temperatures.joursMin()));
	}

	public static void afficherTable(int[]table){
		System.out.println(Arrays.toString(table));
	}
	
}
