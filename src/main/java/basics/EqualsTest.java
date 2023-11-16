package basics;

public class EqualsTest {

    public static void main(String[] args) {

        //primite Datentypen werden mit gleichheitszeichen verglichen ==

        int i = 10;
        int j = 20;
        char c = 'X';

        System.out.println(i == j);
        System.out.println(i == c); // c wird zu int konveretiert und dann erfolgt der Vergleich

        i = j; // primitive Datentypen werden kopiert

        Integer ii = 10;
        Integer jj = 20;

        ii = jj; // Komplexe Datentypen werden nicht kopiert, sondern nur die Referenz auf das Objekt

        // bei komplexen Datentypen
        // vergleicht ob die Referenzen auf das gleiche Objekt zeigen
        // equals() ist der Werte Vergleich

        //Manche Objekte in Java sind Immutable (nicht veränderbar)
        //Immutable: String, Integer, Double, Float, Long, Short, Byte, Character, Boolean

    }
}
