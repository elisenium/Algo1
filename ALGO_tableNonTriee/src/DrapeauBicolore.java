import java.util.Arrays;
import java.util.Random;

public class DrapeauBicolore {
  private int[] t;

  // A NE PAS MODIFIER
  public DrapeauBicolore(int n) {
    t = new int[n];
    Random r = new Random();
    for (int i = 0; i != n; i++) {
      t[i] = r.nextInt();
    }
  }

  // A NE PAS MODIFIER
  public DrapeauBicolore(int[] tab) {
    t = tab;
  }

  public void tri() {
    int i = 0;
    int taille = t.length;

    // AVANT ET APRES CHAQUE PASSAGE DANS LA BOUCLE,
    // ON A LA SITUATION SUIVANTE
    // ---------------------------------------------
    // |    PAIRS   | PAS MODIFIE |    IMPAIRS      |
    // ---------------------------------------------
    //               ^i            ^j

    while (i != taille) {
      if (t[taille - 1] % 2 != 0) {
        taille--;
      }
      else if (t[i] % 2 != 0) {
        int temp = t[i];
        t[i] = t[taille - 1];
        t[taille - 1] = temp;
        taille--;
      }
      else {
        i++;
      }
    }
  }

  public String toString() {
    return Arrays.toString(t);
  }


}