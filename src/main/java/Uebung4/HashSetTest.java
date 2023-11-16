package Uebung4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        // Erstelle ein Set, um die einzigartigen Zufallszahlen zu speichern.
        Set<Integer> einzigartigeZahlen = new HashSet<>();

        // Definiere wie viele einzigartige Zahlen generiert werden muss.
        int anzahlEinzigartigerZahlen = 1000;

        // Verwende eine Schleife, um Zufallszahlen zu generieren.
        while (einzigartigeZahlen.size() < anzahlEinzigartigerZahlen) {
            // Generieren einer Zufallszahl, zwischen 1 und 10000.
            int randomNumber = (int) (Math.random() * 10000) + 1;

            // Hinzufügen der Zufallszahl zum Set.
            einzigartigeZahlen.add(randomNumber);
        }

        // Konvertiere das Set in eine ArrayList.
        ArrayList<Integer> sortierteListe = new ArrayList<>(einzigartigeZahlen);

        // Sortiere die ArrayList.
        Collections.sort(sortierteListe);

        // Ausgabe aller einzigartigen Zufallszahlen in sortierter Reihenfolge.
        for (int number : sortierteListe) {
            System.out.println(number);
        }
    }
}





