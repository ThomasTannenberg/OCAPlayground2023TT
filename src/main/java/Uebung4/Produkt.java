package Uebung4;

import java.util.Date;

public class Produkt {

    private Date jetzt;
    private String name;
    private String beschreibung;
    private double preis;
    private int menge;

    public Produkt(String name, String beschreibung, double preis, int menge) {
        jetzt = new Date();
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
        this.menge = menge;
    }

    public double getPreis() {
        return preis;
    }

    public void setJetzt(Date jetzt) {
        this.jetzt = jetzt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }


    public void setPreis(double preis) {
        this.preis = preis;
    }


    public void setMenge(int menge) {
        this.menge = menge;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "Datum= '" + jetzt + '\'' +
                "Name= '" + name + '\'' +
                ", Beschreibung= '" + beschreibung + '\'' +
                ", Preis= " + preis +
                ", Menge= " + menge +
                '}';
    }
}
