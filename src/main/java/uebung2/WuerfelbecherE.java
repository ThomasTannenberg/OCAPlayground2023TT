package uebung2;

import java.util.Scanner;

public class WuerfelbecherE extends BecherAbstrakt {


    @Override
    protected void auswerten(int[] wuerfe) {

    }

    @Override
    protected void spielen() {


        System.out.println("Wieviele Seiten soll der Würfel haben?");
        int seiten = new Scanner(System.in).nextInt();

        System.out.println("Wie oft möchten Sie würfeln?");
        int anzahl = scanner.nextInt();

        int[] wuerfe = werfeMehrere(anzahl, seiten);
        ausgabe(wuerfe);


    }
}
