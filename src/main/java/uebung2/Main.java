package uebung2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                List<Wuerfel> wuerfelListe = new ArrayList<>();
                System.out.println("Dovie'andi se tovya sagain. (It's time to toss the dice.) ~ Mat Cauthon");
                System.out.println("Geben Sie die Würfeltypen getrennt durch Leerzeichen ein (4 6 8 10 12 20 100) oder 'exit' zum Beenden: ");
                String eingabe = scanner.nextLine();


                if ("exit".equalsIgnoreCase(eingabe)) {
                    break;
                }

                String[] wuerfelTypen = eingabe.split(" ");


                for (String typ : wuerfelTypen) {
                    int seiten = Integer.parseInt(typ);
                    if (seiten == 4 || seiten == 6 || seiten == 8 || seiten == 10 || seiten == 12 || seiten == 20 || seiten == 100) {
                        wuerfelListe.add(Wuerfel.erstelleWuerfel(seiten));
                    } else {
                        System.out.println("Ungültiger Würfeltyp: " + seiten);
                    }
                }
                if (!wuerfelListe.isEmpty()) {
                    WuerfelBecher becher = new WuerfelBecher(wuerfelListe);

                    becher.spielen();
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie nur Zahlen ein.");
            }
        }
        scanner.close();
        System.out.println("Bye Bye");
    }
}
