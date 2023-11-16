package Uebung4;

import java.util.ArrayList;

public class ProduktListe {
    private ArrayList<Produkt> produktListe;

    public ProduktListe() {
        produktListe = new ArrayList<>();
    }

    public boolean istLeer() {
        return produktListe.isEmpty();
    }

    public ArrayList<Produkt> getProduktListe() {
        return produktListe;
    }

    public void setProduktListe(ArrayList<Produkt> produktListe) {
        this.produktListe = produktListe;
    }
}
