package uebung2;

class Wuerfel {
    private int seiten;

    public int getSeiten() {
        return seiten;
    }

    private Wuerfel(int seiten) {
        this.seiten = seiten;
    }

    public static Wuerfel W4() {
        return new Wuerfel(4);
    }

    public static Wuerfel W6() {
        return new Wuerfel(6);
    }

    public static Wuerfel W8() {
        return new Wuerfel(8);
    }


    public static Wuerfel W10() {
        return new Wuerfel(10);
    }

    public static Wuerfel W12() {
        return new Wuerfel(12);
    }

    public static Wuerfel W20() {
        return new Wuerfel(20);
    }

    public static Wuerfel W100() {
        return new Wuerfel(100);
    }

    public static Wuerfel erstelleWuerfel(int seiten) {
        switch (seiten) {
            case 4:
                return Wuerfel.W4();
            case 6:
                return Wuerfel.W6();
            case 8:
                return Wuerfel.W8();
            case 10:
                return Wuerfel.W10();
            case 12:
                return Wuerfel.W12();
            case 20:
                return Wuerfel.W20();
            case 100:
                return Wuerfel.W100();
            default:
                throw new IllegalArgumentException("Ungültiger Würfeltyp");
        }
    }
}

