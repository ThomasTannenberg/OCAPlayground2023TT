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
        if (zahl2 == 0) {
            throw new IllegalArgumentException("Division durch 0");
        } else {
            return zahl1 / zahl2;
        }
    }
}


