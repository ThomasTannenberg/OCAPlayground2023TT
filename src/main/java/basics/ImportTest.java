package basics;

import java.util.Date;

public class ImportTest {

    private int zahl = 10; // Instanzeigenschaft!!!

    public static void main(String[] args) {

        Date now = new Date(); // verwendet das importiert java.util.Date


        // kann fully qualified verwendet werden.
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        sqlDate.toInstant(); //Instanzmethode

        // machWas(); // Instanzmethoden sind in statischen Methoden nicht verfügbar



    }
}
