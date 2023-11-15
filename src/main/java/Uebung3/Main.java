package Uebung3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Roboter roboter = new Roboter();
        roboter.bewege("W");

        while (true) {
            System.out.println("Bewege den Roboter (W, A, S, D) oder beende das Spiel (X): ");
            String richtungen = scanner.nextLine().trim().toUpperCase();

            if (richtungen.equals("X")) {
                System.out.println("Spiel beendet.");
                break;
            }

            if (!richtungen.matches("[WASD]+")) {
                System.out.println("Ungültige Eingabe. Bitte verwende nur W, A, S, D.");
                continue;
            }

            if (!richtungen.isEmpty()) {
                String ersteRichtung = richtungen.substring(0, 1);

                roboter.bewege(ersteRichtung);
                Spielfeld.bewegeMonster(roboter.getX(), roboter.getY());

            }

            Spielfeld.runde++;
            System.out.println("Runde: " + Spielfeld.runde);
            if (Spielfeld.runde % 3 == 0) {
                Spielfeld.addMonster();
            }
        }
        scanner.close();
    }

}





