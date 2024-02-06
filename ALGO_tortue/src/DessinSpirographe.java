public class DessinSpirographe {

    public static Tortue tortue = new Tortue();
    
    public static void main(String args[]) {
        tortue.accelerer();
        
        for (int i = 0; i < 50; i++){
            tortue.accelerer();
            tortue.tournerADroite(10);
 
            for (int j = 0; j < 360; j++) {
                tortue.accelerer();
                tortue.avancer(1);
                tortue.tournerADroite(1);
            }
        }
    }
}