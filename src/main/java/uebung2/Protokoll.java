package uebung2;

import java.util.List;

public class Protokoll {

    public void ausgeben(List<Integer> ergebnisse, List<Wuerfel> wuerfelListe, int wurfNummer) {
        System.out.println("Ergebnisse des Wurfs " + wurfNummer + ":");
        for (int i = 0; i < ergebnisse.size(); i++) {
            System.out.println("Würfel W" + wuerfelListe.get(i).getSeiten() + ": " + ergebnisse.get(i));
        }
    }
}

