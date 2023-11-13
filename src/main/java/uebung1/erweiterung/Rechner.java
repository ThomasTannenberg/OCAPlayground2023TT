package uebung1.erweiterung;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rechner {

    public static List<Protokoll> protokoll = new ArrayList<>();


    public static void addieren(double zahl1, double zahl2) {
        double ergebnis = zahl1 + zahl2;
        protokoll.add(new Protokoll("Addition", zahl1, zahl2, ergebnis));

    }

    public static void subtrahieren(double zahl1, double zahl2) {
        double ergebnis = zahl1 - zahl2;
        protokoll.add(new Protokoll("Subtraktion", zahl1, zahl2, ergebnis));

    }

    public static void multiplizieren(double zahl1, double zahl2) {
        double ergebnis = zahl1 * zahl2;
        protokoll.add(new Protokoll("Multiplikation", zahl1, zahl2, ergebnis));

    }

    public static void dividieren(double zahl1, double zahl2) {
        double ergebnis = zahl1 / zahl2;

        if (ergebnis == Double.POSITIVE_INFINITY || ergebnis == Double.NEGATIVE_INFINITY) {
            System.out.println("Nö, nicht durch 0 teilen! Ergebnis ist " + ergebnis);
            protokoll.add(new Protokoll("Division Fehlgeschlagen!", zahl1, zahl2, ergebnis));
        } else {
            protokoll.add(new Protokoll("Division", zahl1, zahl2, ergebnis));
        }

    }

    public static void druckeProtokoll() {
        Date jetzt = new Date();
        int i = 0;
        System.out.println("Protokoll - " + jetzt);
        System.out.println("------------------------------------------------------");
        for (Protokoll prot : protokoll) {
            i++;
            System.out.println(i + ". " + prot);
        }
    }

}


