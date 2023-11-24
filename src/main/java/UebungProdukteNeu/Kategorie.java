package UebungProdukteNeu;

public enum Kategorie {
    STANDARD("Standardkategorie"),
    VERDERBLICH("Verderbliche Ware");

    private String beschreibung;

    Kategorie(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
}
