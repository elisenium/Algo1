public class DessinCarresEmboites {
    public static void main(String[] args) {
        Tortue tortue = new Tortue();
        tortue.accelerer();
        for (int i = 1; i <= 5; i++) {
            tortue.dessinerUnCarre(100-10*i);
        }
    }
}