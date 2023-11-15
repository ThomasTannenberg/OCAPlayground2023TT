package Uebung3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Roboter roboter = new Roboter();
        Spielfeld.erstelleSpielfeld();

        while (true) {
            System.out.println("Bewege den Roboter (w, a , s, d) oder beende das Spiel (X): ");
            String richtungen = scanner.nextLine().trim().toLowerCase();


            if (richtungen.equals("X")) {
                System.out.println("Spiel beendet.");
                break;
            }


            if (!richtungen.matches("[wasd]+")) {
                System.out.println("Ungültige Eingabe. Bitte verwende nur W, A, S, D.");
                continue;
            }

            roboter.bewege(richtungen);
            Spielfeld.bewegeMonster(roboter.getX(), roboter.getY());
            Spielfeld.druckeSpielfeld(roboter.getX(), roboter.getY());
        }
        scanner.close();
    }
}



