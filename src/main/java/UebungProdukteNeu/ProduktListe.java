package UebungProdukteNeu;

import java.io.FileWriter;
import java.util.ArrayList;


import java.io.IOException;

public class ProduktListe {

    private static final ProduktListe INSTANCE = new ProduktListe();
    private ArrayList<Produkt> lst;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Produkt produkt : lst) {
            sb.append(produkt.toString()).append("\n");
        }
        return sb.toString();
    }



}
