package uebung1;

public class Rechner {

    public static double addieren(double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }

    public static double subtrahieren(double zahl1, double zahl2) {
        return zahl1 - zahl2;
    }

    public static double multiplizieren(double zahl1, double zahl2) {
        return zahl1 * zahl2;
    }

    public static double dividieren(double zahl1, double zahl2) {
        try {
            return zahl1 / zahl2;
        } catch (ArithmeticException e) {
            System.out.println("Nicht durch null teilen! " + e.getMessage());
            return 0.0;
        }
    }
}


