package uebung5a;

public class LoggerTest {
    private static final Logger log = Logger.getInstance();



    private static void addieren(int a, int b) {
        int summe = a + b;

        log.logStart("Addition von " + a + " und " + b + " ergibt: " + summe);
    }

    private static void multiplizieren(int a, int b) {

        int produkt = a * b;

        log.logStart("Multiplikation von " + a + " und " + b + " ergibt: " + produkt);
    }


    public static void main(String[] args) {


        log.logStart("Starte LoggerTest");


        addieren(9, 3);
        multiplizieren(712, 4);
        addieren(5, 2);
        multiplizieren(71, 50);

        log.saveLogToFile();
    }



}
