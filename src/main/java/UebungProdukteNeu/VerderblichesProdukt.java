package UebungProdukteNeu;

public class VerderblichesProdukt extends Produkt{
    public VerderblichesProdukt(String name, String beschreibung, double preis, int menge) {
        super(name, beschreibung, preis, menge);
        setKategorie(Kategorie.VERDERBLICH.getKategorieArt());

    }


}
