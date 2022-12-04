public class Deliberation {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        double somme = 0;
        int nombreEtudiants = 25;
        for (int i = 1; i <= nombreEtudiants; i++) {
            System.out.println("\nVeuillez entrer les 10 notes de l'étudiant n° " + i);
            somme += moyenneEtudiant();
        }
        System.out.println("La moyenne de la classe est de " + somme/nombreEtudiants + "/20");
    }

    public static double moyenneEtudiant() {
        double somme = 0;
        double nombreCotes = 10;
        for (int i = 1; i <= nombreCotes; i++) {
            System.out.print("Entrez la cote n° " + i + " : ");
            somme += Utilitaires.lireReelComprisEntre(0, 20);
        }
        System.out.println("\nLa moyenne de l'etudiant est de " + somme/nombreCotes + "/20");
        return somme/nombreCotes;
    }
}