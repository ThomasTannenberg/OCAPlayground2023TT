package uebung2;

import java.util.Random;

public abstract class BecherAbstrakt {
    protected Random random;
    protected int anzahlWuerfel;
    protected Wuerfel wuerfelTyp;

    public BecherAbstrakt(Wuerfel wuerfelTyp, int anzahlWuerfel) {
        this.random = new Random();
        this.wuerfelTyp = wuerfelTyp;
        this.anzahlWuerfel = anzahlWuerfel;
    }

    public int werfeEinen() {
        return random.nextInt(wuerfelTyp.getSeiten()) + 1;
    }

    public int[] werfeMehrere() {
        int[] ergebnisse = new int[anzahlWuerfel];
        for (int i = 0; i < anzahlWuerfel; i++) {
            ergebnisse[i] = werfeEinen();
        }
        return ergebnisse;
    }

    public int[] auswerten(int[] ergebnisse) {
        int[] zaehler = new int[wuerfelTyp.getSeiten()];

        for (int ergebnis : ergebnisse) {
            zaehler[ergebnis - 1]++;
        }

        return zaehler;
    }

    public void ausgeben(int[] zaehler) {
        System.out.println("Ergebnisse für Würfeltyp W" + wuerfelTyp.getSeiten() + ":");
        for (int i = 0; i < zaehler.length; i++) {
            System.out.println("Wurfergebnis: " + zaehler[i] + " mal " + (i + 1));
        }
    }
}





