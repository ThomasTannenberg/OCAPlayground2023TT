package Uebung4;


public class Main {
    public static void main(String[] args) {

        ProduktListe produktListe = new ProduktListe();

        Verwaltung verwaltung = new Verwaltung(produktListe);
        verwaltung.kommandoZeile();

        }


    }


