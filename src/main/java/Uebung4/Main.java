package Uebung4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ProduktListe produktListe = new ProduktListe();

        Verwaltung verwaltung = new Verwaltung(produktListe);
        verwaltung.kommandoZeile();

        }


    }


