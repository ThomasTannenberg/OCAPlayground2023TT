package uebung1;

public class RechnerTest {

    public static void main(String[] args) {

        double a = 10;
        double b = 5;

        System.out.println("Addition: " + Rechner.addieren(a, b));
        System.out.println("Subtraktion: " + Rechner.subtrahieren(a, b));
        System.out.println("Multiplikation: " + Rechner.multiplizieren(a, b));
        System.out.println("Division: " + Rechner.dividieren(a, b));
    }
}

