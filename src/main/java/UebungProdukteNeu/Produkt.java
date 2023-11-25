package UebungProdukteNeu;
import java.time.format.DateTimeFormatter;

public class Produkt {
    private static int idCounter = 1;
    private String name;
    private String beschreibung;
    private double preis;
    private int menge;
    private String kategorie;
    private String erstellt;
    private int id;
    private String mhd;

    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public Produkt(String name, String beschreibung, double preis, int menge) {
        kategorie = Kategorie.STANDARD.getKategorieArt();
        erstellt = FMT.format(java.time.LocalDateTime.now());
        this.id = idCounter++;
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
        this.menge = menge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id);
        sb.append(", erstellt am: ").append(erstellt);
        sb.append(", Kategorie: ").append(kategorie);
        sb.append(", Name: ").append(name);
        sb.append(", Beschreibung: ").append(beschreibung);
        sb.append(", Preis: ").append(preis);
        sb.append(", Menge: ").append(menge);

        return sb.toString();
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }
}


