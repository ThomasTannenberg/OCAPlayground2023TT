package uebung1.erweiterung;

public class Protokoll {
    private String operation;
    private double zahl1;
    private double zahl2;
    private double ergebnis;

    public Protokoll(String operation, double zahl1, double zahl2, double ergebnis) {
        this.operation = operation;
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
        this.ergebnis = ergebnis;
    }

    @Override
    public String toString() {
        return "Operation: " + operation + ", Zahl1: " + zahl1 + ", Zahl2: " + zahl2 + ", Ergebnis: " + ergebnis;
    }
}

