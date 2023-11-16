package Uebung4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produkt> produktListe = new ArrayList<>();

        Verwaltung verwaltung = new Verwaltung(produktListe);

        verwaltung.kommandoZeile();
    }
}

