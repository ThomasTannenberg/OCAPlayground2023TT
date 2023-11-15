package uebung2;

public class Erweiterung2 {

    public static void main(String[] args) {
        int[] zahlen = {3, 5, 1, 3, 2, 5};
        druckeZahlenHaeufigkeit(zahlen);
    }

    public static void druckeZahlenHaeufigkeit(int[] zahlen) {

        int[] haeufigkeiten = new int[7];


        for (int zahl : zahlen) {
            if (zahl >= 1 && zahl <= 6) {
                haeufigkeiten[zahl]++;
            }
        }


        System.out.print("Wurfergebnis: ");
        for (int i = 1; i < haeufigkeiten.length; i++) {
            System.out.print(haeufigkeiten[i] + " mal " + i);
            if (i < 6) {
                System.out.print(", ");
            }
        }
    }
}
