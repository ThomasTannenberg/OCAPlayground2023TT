package UebungProdukteNeu;
import java.time.format.DateTimeFormatter;

public class Produkt implements ProduktInterface{
    private int id;
    private String name;
    private String beschreibung;
    private double preis;
    private int menge;
    private String kategorie;
    private String time;

    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public Produkt(int id, String name, String beschreibung, double preis, int menge) {
        kategorie = Kategorie.STANDARD.getBeschreibung(); // Kein String.valueOf notwendig
        time = FMT.format(java.time.LocalDateTime.now());
        this.id = id;
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
        this.menge = menge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id);
        sb.append(", erstellt am: ").append(time);
        sb.append(", Kategorie: ").append(kategorie);
        sb.append(", Name: ").append(name);
        sb.append(", Beschreibung: ").append(beschreibung);
        sb.append(", Preis: ").append(preis);
        sb.append(", Menge: ").append(menge);
        return sb.toString();
    }
}


