package UebungProdukteNeu;

import java.time.format.DateTimeFormatter;

public class VerderblichesProdukt extends Produkt{

    private String mhd;

    private static final DateTimeFormatter MHD = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public VerderblichesProdukt(String name, String beschreibung, double preis, int menge) {
        super(name, beschreibung, preis, menge);
        setKategorie(Kategorie.VERDERBLICH.getKategorieArt());
        mhd = MHD.format(java.time.LocalDateTime.now());

    }


}
