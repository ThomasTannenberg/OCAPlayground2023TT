package uebung2;

public class Erweiterung2 {

    public static void main(String[] args) {
        int[] zahlen = {3, 5, 1, 3, 2, 5};
        druckeZahlenHaeufigkeit(zahlen);
    }

    public static void druckeZahlenHaeufigkeit(int[] zahlen) {
        // Array zur Speicherung der Häufigkeiten, Index 0 wird nicht verwendet
        int[] haeufigkeiten = new int[7];

        // Zähle die Häufigkeit jeder Zahl
        for (int zahl : zahlen) {
            if (zahl >= 1 && zahl <= 6) {
                haeufigkeiten[zahl]++;
            }
        }

        // Formatiere und gebe das Ergebnis aus
        System.out.print("Wurfergebnis: ");
        for (int i = 1; i < haeufigkeiten.length; i++) {
            System.out.print(haeufigkeiten[i] + " mal " + i);
            if (i < 6) {
                System.out.print(", ");
            }
        }
    }
}
