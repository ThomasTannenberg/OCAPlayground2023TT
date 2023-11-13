package uebung1;

public class Rechner {


    public static double addieren(double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }

    public static double subtrahieren(double zahl1, double zahl2) {
        return zahl1 - zahl2;
    }

    public static double multiplizieren(double zahl1, double zahl) {
        return zahl1 * zahl;
    }

    public static double dividieren(double zahl1, double zahl2) {
        if (zahl2 == 0) {
            System.out.println("Division durch Null ist nicht erlaubt.");
        }
        return zahl1 / zahl2;
    }
}

