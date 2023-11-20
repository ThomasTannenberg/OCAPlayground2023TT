package uebung5a;

public class LoggerTest {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.logStart("Starte LoggerTest");



        addieren(9, 3);
        multiplizieren(712, 4);
        addieren(1, 2);

        logger.saveLogToFile();
    }

    private static void addieren(int a, int b) {
        Logger logger = Logger.getInstance();
        int summe = a + b;

        logger.logStart("Addition von " + a + " und " + b + " ergibt: " + summe);
    }

    private static void multiplizieren(int a, int b) {
        Logger logger = Logger.getInstance();
        int produkt = a * b;

        logger.logStart("Multiplikation von " + a + " und " + b + " ergibt: " + produkt);
    }



}
