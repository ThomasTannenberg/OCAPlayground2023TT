package basics; // Package-Anweisung, Maximal einmal pro Klasse

import java.util.Date; //Alles aus anderen Packeges muss importiert werden
//alles aus java.lang. ist immer verfügbar

public class DatatypeTest {

    //PascalCase = Klassen, Interfaces und Enums
    //camelCase = variablen, Attribute und Methoden
    //snake_case = wird in Java nicht benutzt!
    //SCREAMING_SNAKE_CASE = Benutzt für Konstanten!
    //packeges = kleinbuchstaben

    //de.GFN.video.converter.MP4Converter
    //com.adobe.video.converter.MP4Converter
    // = Namenskonventionen

    private int anzahl; // Eigenschaft, Instanzvariable. Leben so lange wie die Instanz existiert.
    private static int count; // Klassenvariable. Existieren so lange wie die Klasse existiert

    /**
     * Zum Beschreiben von Methoden.
     * taucht in der Dokumentation auf
     * @param name Attribut
     */
    private void machWas(String name){}; // Methode der Klasse DatatypeTest

    public static void main(String[] args) {

        // Lokale Variablen nur in dem einen Block sichtbar. Block = { .... }
        int i = 100;        //primitive integer
        long l = 100L;      //primitive long
        char c = 'a';       //primitive char
        float f = 1.0f;     //primitive float
        double d = 1.0d;    //primitive double
        boolean b = true;   //primitive boolean
        byte by = 1;        //primitive byte
        short sh = 1;       //primitive short


        StringBuilder sb = new StringBuilder(); //komplexer Datentype
        sb.append("xyz");                       //komplexe Typen haben Methoden
        sb.append(123);                         //Methode


        System.out.println(sb);
        System.out.println("Byte maximal Wert: " + Byte.MAX_VALUE);

        Date heute = new Date(); // Packege muss importiert werden.
        System.out.println(heute);


    }

}
