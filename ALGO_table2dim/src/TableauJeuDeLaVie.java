
public class TableauJeuDeLaVie {

	private boolean[][] table;
	private int longueur; 	// nb colonnes
	private int largeur; 	// nb lignes

	/**
	 * Cree un tableau sans aucune cellule vivante.
	 * @param longueur
	 * @param largeur
	 */
	public TableauJeuDeLaVie(int largeur, int longueur) {
		table = new boolean[largeur][longueur];
		this.largeur = largeur;
		this.longueur = longueur;
	}

	public void setXY(int x, int y, boolean enVie){
		table[x][y] = enVie;
	}

	public boolean getXY(int x, int y){
		return table[x][y];
	}

	/**
	 * Calcule le nombre de voisines vivantes de la cellule x, y
	 * @param x
	 * @return Le nombre de voisines vivantes
	 */
	public int nbVoisines(int x, int y){
		// TODO

		int nbrVoisines = 0;
		for (int i = y - 1; i <= y + 1; i++) {
			for (int j = x - 1; j <= x + 1; j++) {
				if ((i != y || j != x) && table[i][j]) {
					nbrVoisines++;
				}
			}
		}
		return nbrVoisines;
	}

	/**
	 * Calcule l'etat d'une cellule a la generation suivante.
	 * Les regles suivantes sont appliquees:
	 * - Une cellule morte possedant exactement trois voisines vivantes devient vivante (elle nait).
	 * - Une cellule vivante possedant deux ou trois voisines vivantes le reste, sinon elle meurt.
	 * @param x
	 * @param y
	 * @return true si la cellule en x, y sera en vie a la generation suivante
	 */
	private boolean enVieGenerationSuivante(int x, int y) {
		// TODO
		int nbrVoisines = nbVoisines(x, y);
		if (nbrVoisines == 3) {
			return true;
		}
		return getXY(x, y) && nbrVoisines == 2;
	}


	/**
	 * Calcule le tableau de jeu a la generation suivante
	 * en faisant vivre, mourir et naitre des cellules.
	 */
	public void generationSuivante(){
		// TODO
		// Il est indispensable de travailler avec une copie de la table
		boolean[][] newTable = new boolean[largeur + 2][longueur + 2];
		for (int i = 1; i <= longueur; i++) {
			for (int j = 1; j <= largeur; j++) {
				newTable[j][i] = enVieGenerationSuivante(j - 1, i - 1);
			}
		}

		table = newTable;
	}
	
}