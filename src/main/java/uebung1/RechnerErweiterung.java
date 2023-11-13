package uebung1;

import java.util.ArrayList;
import java.util.List;

public class RechnerErweiterung {
    public static List<Protokoll> protokoll = new ArrayList<>();

    public static double addieren(double zahl1, double zahl2) {
        double ergebnis = zahl1 + zahl2;
        protokoll.add(new Protokoll("Addition", zahl1, zahl2, ergebnis));
        return ergebnis;
    }

    public static double subtrahieren(double zahl1, double zahl2) {
        double ergebnis = zahl1 - zahl2;
        protokoll.add(new Protokoll("Subtraktion", zahl1, zahl2, ergebnis));
        return ergebnis;
    }

    public static double multiplizieren(double zahl1, double zahl2) {
        double ergebnis = zahl1 * zahl2;
        protokoll.add(new Protokoll("Multiplikation", zahl1, zahl2, ergebnis));
        return ergebnis;
    }

    public static double dividieren(double zahl1, double zahl2) {
        double ergebnis;
        try {
            ergebnis = zahl1 / zahl2;
            protokoll.add(new Protokoll("Division", zahl1, zahl2, ergebnis));
        } catch (ArithmeticException e) {
            System.out.println("Nicht durch null teilen! " + e.getMessage());
            ergebnis = 0.0;
            protokoll.add(new Protokoll("Division Fehlgeschlagen", zahl1, zahl2, ergebnis));
        }
        return ergebnis;
    }

    public static void druckeProtokoll() {
        for (Protokoll prot : protokoll) {
            System.out.println(prot);
        }
    }
}


