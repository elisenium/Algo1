import java.util.NoSuchElementException;

public class TableNegatifsPuisPositifs {
    private int[] tableNP;
    private int nbNegatifs;
    private int nbPositifsEtNuls;
    private static final int MAX = 10; // taille physique

    // tableNP ne peut pas contenir plus de MAX entiers, mais pourrait en contenir moins
    // Les entiers occupent les (nbNegatifs + nbPositifsEtNuls) premieres cases du tableau!
    // On trouve d'abord les entiers < 0 ensuite les entiers >= 0
    // L'ordre des entiers parmi les entiers < 0 n'a pas d'importance
    // L'ordre des entiers parmi les entiers >= 0 n'a pas d'importance

    /**
     * ce constructeur construit une tableNP en y placant les entiers de la table recue en parametre
     * L'ordre des entiers < 0 dans tableNP doit correspondre a l'ordre des entiers < 0 de la table fournie
     * L'ordre des entiers >= 0 dans tableNP doit correspondre a l'ordre des entiers >= 0 de la table fournie
     * Ex :
     * tableFournie : -5 7 -8 1 0 2 -1 1
     * -->
     * tableNP : -5 -8 -1 7 1 0 2 1
     * @param tableFournie la table avec les entiers a placer dans tableNP
     * @throws IllegalArgumentException si la table fournie est null ou contient plus de MAX entiers
     */
    public TableNegatifsPuisPositifs(int[] tableFournie) {
        if(tableFournie==null || tableFournie.length > MAX)
            throw new IllegalArgumentException();
        tableNP = new int[MAX];
        int indice = 0;

        for (int i = 0; i < tableFournie.length; i++) {
            if (tableFournie[i] < 0) {
                tableNP[indice] = tableFournie[i];
                indice++;
                nbNegatifs++;
            }
        }

        for (int i = 0; i < tableFournie.length; i++) {
            if (tableFournie[i] >= 0) {
                tableNP[indice] = tableFournie[i];
                indice++;
                nbPositifsEtNuls++;
            }
        }

        //Contrainte : pas plus de 2 parcours de la table fournie pour construire la tableNP
        //Lors du 1er parcours, on place les entiers < 0 et lors du 2eme parcours les entiers >= 0

    }

    public int getNbNegatifs() {
        return nbNegatifs;
    }

    public int getNbPositifsEtNuls() {
        return nbPositifsEtNuls;
    }

    /**
     * calcule la moyenne des entiers > 0 (pas les 0)
     * @return la moyenne des entiers > 0 ou 0 s'il n'y a pas d'entiers > 0
     */
    public double moyenneStrictementPositifs(){
        //TODO

        //Pensez a optimiser votre methode !
        //Les entiers > 0 se trouvent parmi les entiers >= 0.

        double somme = 0;
        int entiersPositifs = 0;

        for (int i = 0; i < nbNegatifs + nbPositifsEtNuls; i++) {
            if (tableNP[i] > 0) {
                somme += tableNP[i];
                entiersPositifs++;
            }
        }

        if (somme == 0) return 0;

        return somme / entiersPositifs;

    }

    /**
     * verifie si tous les entiers de la table sont < entier passe en parametre
     * renvoie true si la table est vide
     * @param entier l'entier verifie
     * @return true si les entiers de la table sont tous < entier passe en parametre ou si la table est vide, false sinon
     */
    public boolean tousStrictementPlusPetits(int entier){
        //TODO

        //Pensez a optimiser votre methode !
        //Par exemple, si entier >= 0, tous les negatifs sont forcement plus petits que cet entier ...

        for (int i = 0; i < nbNegatifs + nbPositifsEtNuls; i++) {
            if (tableNP[i] >= entier) return false;
        }

        return true;

    }


    /**
     * supprime de la tableNP le plus grand entier
     * en cas d'ex-aequo, c'est la premiere occurrence qui est supprimee
     * Attention, l'ordre des entiers de la table doit etre conserve
     * Ex :
     * tableNP avant suppression : -5 -2 5 0 8 1 2 8 7 3
     * -->
     * tableNP apres suppression min : -5 -2 5 0 1 2 8 7 3
     * @return l'entier supprime
     * @throws NoSuchElementException si la tableNP est vide
     */
    public int supprimerMax(){
        if(nbNegatifs + nbPositifsEtNuls == 0)
            throw new NoSuchElementException();

        //Pensez a optimiser votre methode !
        //Par exemple, le max se trouve forcement parmi les entiers >= 0, s'il y en a

        int indiceMax = 0;   // initialisation du minimum avec le 1er élément (car table non vide)
        for (int i = 0; i < nbNegatifs + nbPositifsEtNuls; i++) {
            if (tableNP[i] > tableNP[indiceMax]){
                indiceMax = i;
            }
        }
        int max = tableNP[indiceMax];

        // decalages
        for (int i = indiceMax; i < nbNegatifs + nbPositifsEtNuls - 1; i++) {
            tableNP[i] = tableNP[i+1];
        }

        // mise à jour des attributs de tailles logiques
        if (max < 0)
            nbNegatifs--;
        else
            nbPositifsEtNuls--;

        return max;

    }

    //A NE PAS MODIFIER
    //VA SERVIR POUR LES TESTS
    public int nbAjoutsPossible(){
        return tableNP.length-nbNegatifs-nbPositifsEtNuls;
    }

    //A NE PAS MODIFIER
    //VA SERVIR POUR LES TESTS
    public TableNegatifsPuisPositifs(int[] tableARecopier, int nbNegatifs, int nbPositifsEtNuls) {
        tableNP = new int[MAX];
        for (int i = 0; i < tableARecopier.length; i++) {
            tableNP[i] = tableARecopier[i];
        }
        this.nbNegatifs = nbNegatifs;
        this.nbPositifsEtNuls = nbPositifsEtNuls;
    }

    @Override
    //A NE PAS MODIFIER
    //VA SERVIR POUR LES TESTS
    public String toString() {
        String aRenvoyer = "[";
        if(nbNegatifs+nbPositifsEtNuls!=0) {
            aRenvoyer += tableNP[0];
            for (int i = 1; i < nbNegatifs + nbPositifsEtNuls; i++) {
                aRenvoyer += ", " + tableNP[i];
            }
        }
        return aRenvoyer+"]";
    }
}
