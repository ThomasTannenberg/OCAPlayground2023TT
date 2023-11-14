package uebung2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WuerfelBecher extends BecherAbstrakt {
    private Scanner scanner;

    public WuerfelBecher(Wuerfel wuerfelTyp, int anzahlWuerfel, Scanner scanner) {
        super(wuerfelTyp, anzahlWuerfel);
        this.scanner = scanner;
    }

    public void spielen() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Eingabe: Anzahl der Würfe
            System.out.print("Anzahl der Würfe: ");
            int anzahlWuerfe = scanner.nextInt();

            // Würfe durchführen und Ergebnisse anzeigen
            for (int i = 0; i < anzahlWuerfe; i++) {
                int[] ergebnisse = werfeMehrere();
                int[] zaehler = auswerten(ergebnisse);
                ausgeben(zaehler);
            }
        } catch (InputMismatchException e) {

            System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
        } finally {

            scanner.close();
        }
    }
}
