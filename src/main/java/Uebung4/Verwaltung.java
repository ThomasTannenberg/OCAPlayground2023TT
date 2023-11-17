package Uebung4;

import java.util.*;

public class Verwaltung {
    private ArrayList<Produkt> produktListe;


    public Verwaltung(ArrayList<Produkt> produktListe) {
        this.produktListe = produktListe;
    }


    public Verwaltung(ProduktListe produktListe) {
        this.produktListe = produktListe.getProduktListe();
    }

    public void kommandoZeile() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("""
                        1. Produkt hinzufügen
                        2. Produkt anzeigen
                        3. Produkt löschen
                        4. Produkt bearbeiten
                        5. Programm beenden""");
                System.out.print("Eingabe: ");

                int eingabe;
                try {
                    eingabe = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Fehlerhafte Eingabe! Bitte geben Sie eine Zahl ein.");
                    scanner.nextLine();
                    continue;
                }
                scanner.nextLine();

                switch (eingabe) {
                    case 1:
                        hinzufuegenProdukt(scanner);
                        break;
                    case 2:
                        anzeigenProdukt();
                        break;
                    case 3:
                        loescheProdukt(scanner);
                        break;
                    case 4:
                        bearbeiteProdukt(scanner);
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Ungültige Eingabe.");
                        break;
                }
            }
        }
    }

    public void hinzufuegenProdukt(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Beschreibung: ");
        String beschreibung = scanner.nextLine();
        double preis;
        while (true) {
            System.out.print("Preis: ");
            try {
                preis = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Bitte geben Sie eine gültige Zahl für den Preis ein.");
                scanner.nextLine();
            }
        }
        int menge;
        while (true) {
            System.out.print("Menge: ");
            try {
                menge = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Bitte geben Sie eine gültige Zahl für die Menge ein.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        Produkt produkt = new Produkt(name, beschreibung, preis, menge);
        produktListe.add(produkt);
    }

    public void anzeigenProdukt() {
        for (Produkt produkt : produktListe) {
            System.out.println(produkt);
        }
    }

    public void loescheProdukt(Scanner scanner) {
        System.out.print("Name des zu löschenden Produkts: ");
        String name = scanner.nextLine();
        boolean entfernt = produktListe.removeIf(produkt -> produkt.getName().equals(name));
        if (entfernt) {
            System.out.println("Produkt erfolgreich gelöscht.");
        } else {
            System.out.println("Produkt nicht gefunden.");
        }
    }

    public Produkt findeProduktNachName(String name) {
        for (Produkt produkt : produktListe) {
            if (produkt.getName().equals(name)) {
                return produkt;
            }
        }
        return null;
    }

    public void bearbeiteProdukt(Scanner scanner) {
        System.out.print("Name des zu bearbeitenden Produkts: ");
        String name = scanner.nextLine();

        Produkt zuBearbeiten = findeProduktNachName(name);

        if (zuBearbeiten == null) {
            System.out.println("Produkt nicht gefunden!");
            return;
        }

        boolean geaendert = false;

        System.out.print("Neuer Name (Enter für keine Änderung): ");
        String neuerName = scanner.nextLine();
        if (!neuerName.isEmpty()) {
            zuBearbeiten.setName(neuerName);
            geaendert = true;
        }

        System.out.print("Neue Beschreibung (Enter für keine Änderung): ");
        String neueBeschreibung = scanner.nextLine();
        if (!neueBeschreibung.isEmpty()) {
            zuBearbeiten.setBeschreibung(neueBeschreibung);
            geaendert = true;
        }

        System.out.print("Neuer Preis (Enter für keine Änderung): ");
        String neuerPreis = scanner.nextLine();
        if (!neuerPreis.isEmpty()) {
            neuerPreis = neuerPreis.replace(',', '.');
            Double neuerPreisDouble = Double.parseDouble(neuerPreis);
            zuBearbeiten.setPreis(neuerPreisDouble);
            geaendert = true;
        }

        System.out.print("Neue Menge (Enter für keine Änderung): ");
        String neueMenge = scanner.nextLine();
        if (!neueMenge.isEmpty()) {
            neueMenge = neueMenge.replace(',', '.');
            int neueMengeInt = Integer.parseInt(neueMenge);
            zuBearbeiten.setMenge(neueMengeInt);
            geaendert = true;
        }

        System.out.println("Mit Enter bestätigen");
        scanner.nextLine();


        if (geaendert) {
            zuBearbeiten.setJetzt(new Date());
            System.out.println("Produkt erfolgreich bearbeitet und Datum aktualisiert!");
        } else {
            System.out.println("Keine Änderungen vorgenommen.");
        }
    }

}


