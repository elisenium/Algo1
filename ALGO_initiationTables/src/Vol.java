/**
 *  
 *  Classe permettant de memoriser et de traiter les coordonnees d'un vol
 *  
 *   
 * @author Elise Grelaud
 * 
 *  
 **/


public class Vol {

	private String nom; // nom du parapentiste
	private Coordonnees[] tableCoordonnees;

	// A NE PAS MODIFIER
	/**
	 * constructeur par recopie, le nom du parapentiste est Tommy
	 * @param tableCoordonnees la table de coordonnees a recopier
	 * @throws IllegalArgumentException si la table de coordonnees est null ou vide
	 */
	public Vol(Coordonnees[] tableCoordonnees) throws IllegalArgumentException{
		if(tableCoordonnees==null)
			throw new IllegalArgumentException();
		if(tableCoordonnees.length==0)
			throw new IllegalArgumentException();
		this.tableCoordonnees = new Coordonnees[tableCoordonnees.length];
		for (int i = 0; i < tableCoordonnees.length; i++) {
			this.tableCoordonnees[i]=tableCoordonnees[i];
		}
		this.nom = "tommy";
	}

	// A NE PAS MODIFIER
	/**
	 * constructeur par recopie
	 * @param nom le nom du parapentiste
	 * @param tableCoordonnees
	 * @throws IllegalArgumentException en cas de parametre invalide
	 */
	public Vol(String nom, Coordonnees[] tableCoordonnees) throws IllegalArgumentException{
		this(tableCoordonnees);
		if(nom==null)
			throw new IllegalArgumentException();
		if(nom.length()==0)
			throw new IllegalArgumentException();
		this.nom = nom;
	}


	// choix 1
	/**
	 * renvoie le lieu d'arrivee
	 * precondition (a ne pas verifier) la table de coordonnees n'est pas vide
	 * @return les coordonnees du lieu d'arrivee
	 */
	public Coordonnees lieuArrivee(){
		return tableCoordonnees[tableCoordonnees.length-1];
	}


	// choix 2
	/**
	 * verifie si le lieu de depart correspond au lieu d'arrivee
	 * precondition (a ne pas verifier) la table de coordonnees n'est pas vide
	 * @return true si les coordonnees du lieu de depart sont identiques a celles du lieu d'arrivee, false sinon
	 */
	public boolean estUnTour(){
		// pensez a utiliser la methode equals() de la classe Coordonnee

		if(tableCoordonnees == null) {
			throw new IllegalArgumentException();
		} else if (tableCoordonnees[0].equals(lieuArrivee())){
			return true;
		} else {
			return false;
		}
	}


	// choix 3
	/**
	 * renvoie le lieu survole apres n unites de temps
	 * (n = 0 --> lieu de depart)
	 * precondition (a ne pas verifier) la table de coordonnees n'est pas vide
	 * @param n le nombre d'unites de temps
	 * @return les coordonnees demandees ou null si un tel lieu n'existe pas car le vol n'est pas assez long
	 */
	public Coordonnees niemeLieu(int n){
		// !!!!!!Pas de boucle for!!!!!! REFLECHISSEZ !

		if (n < 0 || n >= tableCoordonnees.length) {
			return null;
		} else if (tableCoordonnees.length >= 0 && n < tableCoordonnees.length) {
			return tableCoordonnees[n];
		}
		return tableCoordonnees[n];
	}
	

	// choix 4
	/**
	 * renvoie le lieu survole le plus au sud du parcours
	 * En cas d'ex-aequo, ce sera le premier lieu qui sera renvoye
	 * Le lieu le plus au sud est le lieu qui a la plus petite latitude
	 * precondition (a ne pas verifier) la table de coordonnees n'est pas vide
	 * @return les coordonnees du lieu le plus au sud
	 */
	public Coordonnees lieuLePlusAuSud() {
		Coordonnees lieuLePlusAuSud = tableCoordonnees[0];

		for (Coordonnees coordonnees : tableCoordonnees) {
			if (coordonnees.getLatitude() < lieuLePlusAuSud.getLatitude()) {
				lieuLePlusAuSud = coordonnees;
			}
		}

		return lieuLePlusAuSud;
	}


	// choix 5
	/**
	 * renvoie le lieu survole le plus eloigne (a vol d'oiseau) du lieu de depart
	 * En cas d'ex-aequo, ce sera le premier lieu qui sera renvoye
	 * precondition (a ne pas verifier) la table de coordonnees n'est pas vide
	 * @return les coordonnees du lieu le plus eloigne du lieu de depart
	 */
	public Coordonnees lieuLePlusEloigne(){

		// pensez a utiliser la methode distance() de la classe Coordonnee
		// la distance est un reel (double)
		double distance = 0;
		int x = 0;
		// declaration de la coordonnée max
		Coordonnees max = tableCoordonnees[0];
		// boucle for avec condition (de sortie)
		for (int i = 1; i < tableCoordonnees.length; i ++){
			if (tableCoordonnees[i].distance(max)>distance){
				distance = max.distance(tableCoordonnees[i]);
				x = i;
			}
		}
		return tableCoordonnees[x];
	}
	
	
	// choix 6
	/**
	 * verifie si la cible a ete atteinte
	 * @param cible les coordonnees de la cible a atteindre
	 * @return true si on trouve au moins une fois des coordonnees d'un lieu survole identiques aux coordonnees de la cible, false sinon
	 * @throws IllegalArgumentException si la cible est null
	 */
	public boolean cibleAtteinte(Coordonnees cible){
		
		if (cible == null)
			throw new IllegalArgumentException("la cible est nulle");
		// pensez a utiliser la methode equals() de la classe Coordonnee

		for (Coordonnees coordonneees : tableCoordonnees) {
			if (cible.equals(coordonneees)){
				return true;
			}
		}
		return false;
	}


	// choix 7
	/**
	 * calcule le nombre de cibles atteintes
	 * L'ordre dans lequel les cibles sont atteintes n'a aucune importance
	 * Si une cible est atteinte plus d'une fois, elle n'est comptabilisee qu'une fois
	 * precondition (a ne pas verifier) la table des cibles ne contient pas de doublons
	 * @param cibles la table avec les coordonnees des cibles a atteindre
	 * @return le nombre demande
	 * @throws IllegalArgumentException si la table de cibles est null
	 */
	public int nombreCiblesAtteintes(Coordonnees[] cibles){

		if(cibles==null)
			throw new IllegalArgumentException();

		// pensez a utiliser la methode cibleAtteinte()

		int nombreCiblesAtteintes = 0;
		for (Coordonnees cible : cibles) {
			if (cibleAtteinte(cible)) nombreCiblesAtteintes++;
		}
		return nombreCiblesAtteintes;
	}


	// choix 8
	/**
	 * calcule la distance parcourue. 
	 * Cette distance sera obtenue en additionnant les distances des segments du parcours memorise.
	 * @return distance parcourue.
	 */
	public double distance() {
		
		// pensez a utiliser la methode distance() de la classe Coordonnee
		// la distance est un reel (double)
	
		double distance = 0;

		for (int i = 1; i < tableCoordonnees.length; i++){
			distance += tableCoordonnees[i].distance(tableCoordonnees[i-1]);
		}
		return distance;
	}


	


	// choix 9
	/**
	 * renvoie un booleen signalant si un meme lieu a ete survole plusieurs fois 
	 * Si le lieu d'arrivee correspond au lieu de depart, on considere que ce lieu a ete survole plusieurs fois
	 * @return true si un meme lieu a ete survole plusieurs fois, false sinon
	 */
	public boolean aSurvoleUnMemeLieu() {
		// Cette methode est proposee en DEFI!
		// pensez a utiliser la methode equals() de la classe Coordonnee
		
		for (Coordonnees coordonnees1 : tableCoordonnees){
			for (Coordonnees coordonnees2 : tableCoordonnees){
				if (coordonnees1 != coordonnees2){
					if (coordonnees1.equals(coordonnees2)) return true;
				}
			}
		}
		return false;
	}
	
	
	// choix 10
	/**
	 * verifie si toutes les cibles sont dans le parcours et dans le même ordre.
	 * @param cibles la table des cibles faisant partie du parcours
	 * @return true si le parcours a bien ete suivi, false sinon
	 * @throws IllegalArgumentException si la table de cibles est null
	 */
	public boolean parcoursSuivi(Coordonnees[] cibles){
		// Cette methode est proposee en DEFI!
		if(cibles==null)
			throw new IllegalArgumentException();
		
		// pensez a utiliser la methode equals() de la classe Coordonnee
		int i = 0;
		for (Coordonnees coordonnees : tableCoordonnees) {
			if (coordonnees.equals(cibles[i])){
				i++;
			}
			if (i == cibles.length) return true;
		}
		return false;
	}


	
	// DEFI (amelioration choix 9)
	/**
	 * verifie si le parapentiste a croise son propre
	 * parcours. Si le lieu d'arrivee correspond au lieu de depart, celui-ci ne
	 * sera pas considere comme un croisement. Vous utiliserez la methode
	 * segmentsCroises de la classe de Coordonnees .
	 * @return true s'il a croise au moins une fois son parcours, false sinon
	 */
	public boolean aCroiseSonParcours() {
		
		// Cette methode est proposee en DEFI!
		// cfr enonce
		for (int i = 1; i < tableCoordonnees.length; i++) {
			for (int j = 1; j < tableCoordonnees.length; j++) {
				if (i == j) {
					break;
				}
				boolean ans = Coordonnees.segmentsCroises(tableCoordonnees[i-1],tableCoordonnees[i],tableCoordonnees[j-1],tableCoordonnees[j]); // !! Coordonnees pour pouvoir appeler la méthode
				if (ans == true) {
					return ans;
				}
			}
		}
		return false;
	}
}