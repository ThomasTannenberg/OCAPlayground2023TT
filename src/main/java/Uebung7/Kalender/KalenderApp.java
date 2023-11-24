package Uebung7.Kalender;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.LocalDate;

public class KalenderApp {

    private static Kalender kalender = new Kalender();
    private static Scanner scanner = new Scanner(System.in);
    private Kategorie kategorie; //ENUM: GESCHÄFTLICH, PERSÖNLICH, FREIZEIT
    private Uhrzeit uhrzeit; //ENUM: Uhrzeit stündlich
    private LocalDateTime time;

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nKalender-Anwendung");
            System.out.println("1. Neuer Termin");
            System.out.println("2. Alle Termine anzeigen");
            System.out.println("3. Termine für ein bestimmtes Datum anzeigen");
            System.out.println("4. Beenden");
            System.out.print("Wählen Sie eine Option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTermin();
                    break;
                case 2:
                    displayAllTermine();
                    break;
                case 3:
                    displayTermineForDate();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Ungültige Auswahl. Bitte versuchen Sie es erneut.");
            }
        }
    }

    private static void addTermin() {
        System.out.print("Geben Sie das Datum ein (dd.MM.yyyy): ");
        String date = scanner.nextLine();

        System.out.println("Wählen Sie eine Uhrzeit:");
        for (Uhrzeit uhr : Uhrzeit.values()) {
            System.out.println(uhr.ordinal() + 1 + ". " + uhr);
        }
        int uhrzeitIndex = scanner.nextInt();
        Uhrzeit uhrzeit = Uhrzeit.values()[uhrzeitIndex - 1];
        scanner.nextLine(); // Clear the buffer

        System.out.println("Wählen Sie eine Kategorie:");
        for (Kategorie kat : Kategorie.values()) {
            System.out.println(kat.ordinal() + 1 + ". " + kat);
        }
        int kategorieIndex = scanner.nextInt();
        Kategorie kategorie = Kategorie.values()[kategorieIndex - 1];
        scanner.nextLine(); // Clear the buffer

        try {
            //Termin termin = new Termin(String time, String name, String description, Kategorie kategorie, Uhrzeit uhrzeit);
            //kalender.addTermin(termin);
            System.out.println("Termin hinzugefügt.");
        } catch (DateTimeParseException e) {
            System.out.println("Fehler beim Parsen des Datums. Bitte versuchen Sie es erneut.");
        }
    }

    private static void displayAllTermine() {
        System.out.println("\nAlle Termine:");
        kalender.displayAllTermine();
    }

    private static void displayTermineForDate() {
        System.out.print("Geben Sie das Datum ein (dd.MM.yyyy): ");
        String dateStr = scanner.nextLine();

        try {
            //LocalDate date = LocalDate.parse(dateStr, Termin.FMT.toFormat());
            System.out.println("\nTermine für " + dateStr + ":");
            //kalender.displayTermineForDate(date);
        } catch (DateTimeParseException e) {
            System.out.println("Fehler beim Parsen des Datums. Bitte versuchen Sie es erneut.");
        }
    }
}

