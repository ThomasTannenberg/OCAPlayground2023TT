package Uebung3;

class Roboter {
    private int x, y;

    public Roboter() {
        x = 0;
        y = 0;
    }

    public void bewege(String richtungen) {
        for (char richtung : richtungen.toCharArray()) {
            switch (richtung) {
                case 'W': y = Math.max(y - 1, 0); break;
                case 'O': y = Math.min(y + 1, Spielfeld.GROESSE - 1); break;
                case 'S': x = Math.min(x + 1, Spielfeld.GROESSE - 1); break;
                case 'N': x = Math.max(x - 1, 0); break;
            }
            Spielfeld.druckeSpielfeld(x, y);
        }
    }
}



