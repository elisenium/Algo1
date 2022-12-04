public class Multiplication3Entiers {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrainement aux multiplications. Voici un exercice :");

        int nombre1 = unEntierAuHasardEntre (0, 10);
        int nombre2 = unEntierAuHasardEntre (0, 10);
        int nombre3 = unEntierAuHasardEntre (0, 10);
        System.out.println("Calculez : " + nombre1 + " x " + nombre2 + " x " + nombre3 + " = ");
        int reponse = scanner.nextInt();
        int produit = nombre1 * nombre2 * nombre3;

        if (reponse == produit) {
            System.out.print("Bravo !");
        }
        else {
            System.out.println(nombre1 + " x " + nombre2 + " x " + nombre3 + " = " + produit);
        }
    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        return (int)((Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale);
    }
}