package uebung2;

import java.util.Random;

public class Wuerfelbecher {

    private Random random;

    public Wuerfelbecher() {
        random = new Random();
    }

    public int werfeWuerfel(int seiten) {
        return random.nextInt(seiten) + 1;
    }

    public int[] werfeMehrereWuerfel(int anzahl, int seiten) {
        int[] ergebnisse = new int[anzahl];
        for (int i = 0; i < anzahl; i++) {
            ergebnisse[i] = werfeWuerfel(seiten);
        }
        return ergebnisse;
    }

    public void auswertenUndAnzeigen(int[] wurfe) {
        int[] haeufigkeit = new int[10]; // Maximal 10 Seiten (für W10)
        for (int wurf : wurfe) {
            if (wurf <= haeufigkeit.length) {
                haeufigkeit[wurf - 1]++;
            }
        }

        System.out.println("Wurfergebnis:");
        for (int i = 0; i < haeufigkeit.length; i++) {
            System.out.println((i + 1) + " mal " + haeufigkeit[i]);
        }
    }

    public static void main(String[] args) {
        Wuerfelbecher becher = new Wuerfelbecher();
        int[] ergebnisse = becher.werfeMehrereWuerfel(6, 6); // 6 Würfe mit einem W6
        becher.auswertenUndAnzeigen(ergebnisse);
    }
}

