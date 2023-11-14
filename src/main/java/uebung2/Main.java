package uebung2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Eingabe: Anzahl der Würfel
            System.out.print("Anzahl der Würfel: ");
            int anzahlWuerfel = scanner.nextInt();

            // Eingabe: Typ des Würfels
            System.out.print("Typ des Würfels (4, 6, 8, 10, 12, 20, 100): ");
            int seiten = scanner.nextInt();

            Wuerfel wuerfelTyp = Wuerfel.erstelleWuerfel(seiten);
            WuerfelBecher becher = new WuerfelBecher(wuerfelTyp, anzahlWuerfel, scanner);
            becher.spielen();
        } catch (Exception e) {
            System.out.println("Es ist ein Fehler aufgetreten: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}



