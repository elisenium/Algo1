public class CalculBMI {

    //BMI = P/T^2

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrez votre poids (kg) : ");
        int poids = scanner.nextInt();
        System.out.println("Entrez votre taille (m) : ");
        float taille = scanner.nextFloat();
        double bmi = poids/Math.pow(taille,2);

        if (20<bmi && bmi<25) {
            System.out.println("Votre BMI est de " + bmi);
            System.out.println("La personne est considérée comme étant normale");
        }
        else {
            if (bmi<20){
                System.out.println("Votre BMI est de " + bmi);
                System.out.println("La personne est considérée comme étant mince");
            }
            if (bmi>25){
                System.out.println("Votre BMI est de " + bmi);
                System.out.println("La personne est considérée comme étant en embonpoint");
            }
        }
    }
}
