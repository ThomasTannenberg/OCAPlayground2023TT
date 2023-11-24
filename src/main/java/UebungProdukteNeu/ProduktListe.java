package UebungProdukteNeu;

import java.util.ArrayList;

public class ProduktListe {

    private static final ProduktListe INSTANCE = new ProduktListe();
    private ArrayList<Produkt> lst;

    // Privater Konstruktor
    private ProduktListe() {
        lst = new ArrayList<>();
    }

    public static ProduktListe getInstance() {
        return INSTANCE;
    }
    public ArrayList<Produkt> getLst() {
        return lst;
    }
    public void addProdukt(Produkt produkt) {
        lst.add(produkt);
    }

}
