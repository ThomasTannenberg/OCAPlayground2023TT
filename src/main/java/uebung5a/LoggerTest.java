package uebung5a;

public class LoggerTest {
    private static final Logger log = Logger.getInstance();



    private static void add(int a, int b) {
        int erg = a + b;

        log.logStart("Addition von " + a + " und " + b + " ergibt: " + erg);
    }

    private static void multiplizieren(int a, int b) {

        int erg = a * b;

        log.logStart("Multiplikation von " + a + " und " + b + " ergibt: " + erg);
    }


    public static void main(String[] args) {


        log.logStart("Starte LoggerTest");


        add(9, 3);
        multiplizieren(500, 4);
        add(1, 2);

        log.saveLogToFile();
    }



}
