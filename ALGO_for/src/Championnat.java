public class Championnat {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int jury = 8;
        double coteHaute = - Double.MAX_VALUE; // la plus petite cote possible
        double coteBasse = 10; //la cote la plus basse
        double somme = 0;
        double moyenne = 0;
        int coteRestantes = jury - 2;

        for (int i = 1; i <= jury; i++) {
            System.out.print("Entrez la cote n°" + i + " : ");
            double cote = scanner.nextDouble();
            somme = somme + cote;
            if (cote > coteHaute) {
                coteHaute = cote;
            }
            if (cote < coteBasse) {
                coteBasse = cote;
            }
        }
        moyenne = (somme - coteBasse - coteHaute) / coteRestantes;
        if (moyenne >= 8) {
            System.out.println("Sélectionné(e) pour le finale !");
        } else {
            System.out.println("Eliminé(e)");
        }
        System.out.println("La cote la plus élevée est " + coteHaute);
        System.out.println("La cote la plus basse est " + coteBasse);
        System.out.println("La moyenne s'élève à " + moyenne);
    }
}