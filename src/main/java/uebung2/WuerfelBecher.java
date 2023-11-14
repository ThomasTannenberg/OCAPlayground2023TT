package uebung2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WuerfelBecher {
    private Random random;
    private Scanner scanner;
    private List<Wuerfel> wuerfelListe;
    private Protokoll protokoll;

    public WuerfelBecher(List<Wuerfel> wuerfelListe) {
        this.random = new Random();
        this.scanner = new Scanner(System.in);
        this.wuerfelListe = wuerfelListe;
        this.protokoll = new Protokoll();
    }

    private List<Integer> werfeMehrere() {
        List<Integer> ergebnisse = new ArrayList<>();

        for (Wuerfel w : wuerfelListe) {
            ergebnisse.add(random.nextInt(w.getSeiten()) + 1);
        }
        return ergebnisse;
    }

    public void spielen() {
        try {
            System.out.print("Anzahl der Würfe: ");
            int anzahlWuerfe = scanner.nextInt();

            for (int i = 0; i < anzahlWuerfe; i++) {
                List<Integer> ergebnisse = werfeMehrere();
                protokoll.ausgeben(ergebnisse, wuerfelListe, i + 1);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
            scanner.next();
        }

    }


}

