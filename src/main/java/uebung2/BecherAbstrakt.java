package uebung2;

import java.util.Random;
import java.util.Scanner;


public abstract class BecherAbstrakt {
    private Random random;


    public BecherAbstrakt() {
        random = new Random();

    }

    protected int werfeEinen(int Seiten) {
        return random.nextInt(Seiten) + 1;
    }

    protected int[] werfeMehrere(int anzahl, int Seiten) {
        int[] ergebnisse = new int[anzahl];
        for (int i = 0; i < anzahl; i++) {
            ergebnisse[i] = werfeEinen(Seiten);
        }
        return ergebnisse;
    }

    public void ausgabe(int[] wuerfe) {
        for (int i = 0; i < wuerfe.length; i++) {
            System.out.println("" + (i + 1) + " mal " + wuerfe[i]);
        }
    }

    protected abstract void auswerten(int[] wuerfe);

    protected abstract void spielen();
}

