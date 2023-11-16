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

    public Date getJetzt() {
        return jetzt;
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

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "Name='" + name + '\'' +
                ", Beschreibung='" + beschreibung + '\'' +
                ", Preis=" + preis +
                ", Menge=" + menge +
                '}';
    }
}
