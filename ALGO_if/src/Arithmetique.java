public class Arithmetique {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int operation = unEntierAuHasardEntre (1, 4);
        int nombre1 = unEntierAuHasardEntre(1,100);
        int nombre2 = unEntierAuHasardEntre(1,100);
        int addition = 1;
        int soustraction = 2;
        int multiplication = 3;
        int division = 4;

        if (operation == addition){
            System.out.println("Calculez : " + nombre1 + " + " + nombre2 + " = ");
            int reponse = scanner.nextInt();
            int somme = nombre1 + nombre2;
            if (reponse == somme) {
                System.out.print("Bravo !");
            }
            else {
                System.out.println(nombre1 + " + " + nombre2 + " = " + somme);
            }
        }
        else if (operation == soustraction){
            System.out.println("Calculez : " + nombre1 + " - " + nombre2 + " = ");
            int reponse = scanner.nextInt();
            int difference = nombre1 - nombre2;
            if (reponse == difference) {
                System.out.print("Bravo !");
            }
            else {
                System.out.println(nombre1 + " - " + nombre2 + " = " + difference);
            }
        }
        else if (operation == multiplication){
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
        else if (operation == division){
            int quotient = nombre1 / nombre2;
            int entier = nombre1 % nombre2;
            if (entier==0){
                System.out.println("Calculez : " + nombre1 + " / " + nombre2 + " = ");
                int reponse = scanner.nextInt();
                if (reponse == quotient) {
                    System.out.print("Bravo !");
                }
                else {
                    System.out.println(nombre1 + " / " + nombre2 + " = " + quotient);
                }
            }
            else {
                System.out.println(nombre1 + " / " + nombre2 + " -> Calcul impossible");
            }
        }

    }
    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        return (int)((Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale);
    }
}
