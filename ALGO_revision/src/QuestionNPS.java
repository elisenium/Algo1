import java.util.NoSuchElementException;

public class QuestionNPS {
	
	private String question;
	private int[] tableReponses;
	
	// A NE PAS CHANGER
	// VA SERVIR POUR LES TESTS
	public QuestionNPS(String question, int[] tableARecopier){
		if(tableARecopier==null)
			throw new IllegalArgumentException();
		//if(!contientReponses(tableARecopier))
		//	throw new IllegalArgumentException();
		this.question = question;
		this.tableReponses = new int[tableARecopier.length];
		for (int i = 0; i < tableARecopier.length; i++) {
			tableReponses[i]=tableARecopier[i];
		}
	}

	/**
	 * verifie si les entiers sont bien tous compris entre 0 et 10
	 * les reponses autorisees seront toujours comprises entre 0 et 10
	 * @param table la table a verifier
	 * @return true si tous les entiers sont des reponses, false sinon
	 * @throws IllegalArgumentException si la table est null
	 */
	public static boolean contientReponses(int[] table) {
		if(table == null)
			throw new IllegalArgumentException();

		// cette methode est static! C'est la table passee en parametre qui est verifiee

		for (int i = 0; i < table.length ; i++){
			if (table[i] < 0 || table[i] > 10){
				return false;
			}
		}
		return true;
	}

	/**
	 * calcule la moyenne des reponses
	 * @return la moyenne
	 * @throws NoSuchElementException s'il n'y a pas de reponse
	 */
	public double moyenne(){
		if(tableReponses.length == 0)
			throw new NoSuchElementException();
		// TODO
		// cette methode renvoie un reel.
		// pour eviter une division entiere, declarez une variable somme de type reel
		double somme = 0;
		for (int i = 0; i < tableReponses.length; i++){
			somme += tableReponses[i];
		}
		return somme/tableReponses.length;
	}

	/**
	 * renvoie le nombre de detracteurs
	 * un detracteur a donne une reponse <= 6
	 * @return le nombre de detracteurs
	 */
	public int nombreDetracteurs(){
		int nbreDetracteurs = 0;
		for (int i = 0; i < tableReponses.length; i++){
			if (tableReponses[i] <= 6){
				nbreDetracteurs++;
			}
		}
		return nbreDetracteurs;
	}

	/**
	 * calcule le score NPS 
	 * @return le score NPS
	 * @throws NoSuchElementException s'il n'y a pas de reponse
	 */

	public int nombrePromoteurs(){
		int nbrePromoteurs = 0;
		for (int i = 0; i < tableReponses.length; i++){
			if (tableReponses[i] == 9 || tableReponses[i] == 10){
				nbrePromoteurs++;
			}
		}
		return nbrePromoteurs;
	}

	public double scoreNPS(){
		if(tableReponses.length == 0)
			throw new NoSuchElementException();
		// TODO
		// cfr enonce
		// Pensez a utiliser la methode nombreDetracteurs()
		// Pensez a introduire une methode nombrePromoteurs()
		// Le score est un reel
		// Pour provoquer une division reelle, commencez le calcul par 100.0 * ...
		double pourcentDetracteurs = 100*nombreDetracteurs()/tableReponses.length;
		double poucentPromoteurs = 100*nombrePromoteurs()/tableReponses.length;

		return poucentPromoteurs - pourcentDetracteurs;
	}

	
	/**
	 * construit une table de frequences a partir des reponses reprises dans tableReponses
	 * @return la table de frequences
	 */
	public int[] tableFrequences(){
		
		// TODO
		// Regardez bien l'exemple de l'enonce

		// Il est possible d'ecrire cette methode en faisant un seul parcours de la table des reponses

		// Si vous avez du mal pour cette methode, lisez le "coup de pouce"
		int[] tableFrequences = new int[11];
		for (int i = 0; i < tableReponses.length; i++){
			tableFrequences[tableReponses[i]]++;
		}
		return tableFrequences;
	}


	/**
	 * recherche la mediane des reponses
	 * @return la mediane
	 * @throws NoSuchElementException s'il n'y a pas de reponse
	 */
	public int mediane(){

		if(tableReponses.length == 0)
			throw new NoSuchElementException();

		// TODO
		// CONTRAINTE : UTILISEZ L'ALGORITHME DECRIT DANS L'ENONCE

		// Si vous avez du mal pour cette methode, lisez le "coup de pouce"

		int[] copie = new int[tableReponses.length];
		for (int i = 0; i < copie.length; i++){
			copie[i] = tableReponses[i];
		}

		int nbreEtapes = (tableReponses.length/2)+1; //Algorithme proposé dans l'exercice
		int min = 0;
		for (int etape = 1; etape <= nbreEtapes; etape++){ //Integrer le nombre d'etapes
			min = copie[0]; //Minimum à partir du début de la liste
			int indiceMin = 0; //Predefinir l'indice min avant la boucle for
			for (int i = 1; i < copie.length; i++) { //Trouver la plus petite valeur
				if (copie[i]<min){
					min = copie[i];
					indiceMin = i; //Retenir l'endroit du min dans la table
				}
			}
			copie[indiceMin]=11; //Remplacer le min par 11
		}
		return min;
	}


	// A NE PAS CHANGER
	// VA SERVIR POUR LES TESTS
	public String toString(){
		String aRenvoyer = ""+question+" ";
		for (int i = 0; i < tableReponses.length; i++) {
			aRenvoyer += tableReponses[i] + " ";
		}
		return aRenvoyer;
	}

}
