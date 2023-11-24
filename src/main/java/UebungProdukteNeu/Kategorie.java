package UebungProdukteNeu;

public enum Kategorie {
    STANDARD("Standardkategorie"),
    VERDERBLICH("Verderbliche Ware");

    private String katArt;

    Kategorie(String katArt) {
        this.katArt = katArt;
    }

    public String getKategorieArt() {
        return katArt;
    }
}
