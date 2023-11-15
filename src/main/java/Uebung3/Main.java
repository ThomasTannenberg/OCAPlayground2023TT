package Uebung3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Roboter roboter = new Roboter();

        System.out.println("Willkommen zum Roboterspiel.\n" +
                "Bewegen Sie den Roboter [8] mit den Tasten N, S, W, O.\n" +
                "Wenn Sie die Monster [5] erreichen, ist es GAME OVER.\n" +
                "Geben Sie 'exit' ein, um das Spiel zu beenden.\n" +
                "Viel Spaß!");

        String eingabe;
        boolean spielLaeuft = true;

        while (spielLaeuft) {
            System.out.print("Geben Sie die Bewegungsrichtung ein (N, S, W, O) oder 'exit' zum Beenden: ");
            eingabe = scanner.nextLine();

            if (eingabe.equalsIgnoreCase("exit")) {
                spielLaeuft = false;
            } else {
                roboter.bewege(eingabe);
                // Hier könnten Sie zusätzliche Logik hinzufügen, um zu prüfen, ob der Roboter auf ein "Monster" trifft.
            }
        }

        System.out.println("Programm beendet");
    }
}

