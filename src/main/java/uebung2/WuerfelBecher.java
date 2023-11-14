package uebung2;

import java.util.Scanner;

public class WuerfelBecher extends BecherAbstrakt {
    private Scanner scanner;

    public WuerfelBecher(Wuerfel wuerfelTyp, int anzahlWuerfel, Scanner scanner) {
        super(wuerfelTyp, anzahlWuerfel);
        this.scanner = scanner;
    }

    public void spielen() {
        Scanner scanner = new Scanner(System.in);

        // Eingabe: Anzahl der Würfe
        System.out.print("Anzahl der Würfe: ");
        int anzahlWuerfe = scanner.nextInt();

        // Würfe durchführen und Ergebnisse anzeigen
        for (int i = 0; i < anzahlWuerfe; i++) {
            int[] ergebnisse = werfeMehrere();
            int[] zaehler = auswerten(ergebnisse);
            ausgeben(zaehler);
        }

        scanner.close();
    }


}
