package basics;

import java.time.LocalDate;
import java.util.ArrayList;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "Das ist das Haus von Nikigraus!"; // Literal landet im Pool
        String s2 = "Das ist das Haus von Nikigraus!";  // Verweis das Objekt im Pool

        System.out.println(s1 == s2);       // Referenzvergleich
        System.out.println(s1.equals(s2));  // Wertevergleich
        System.out.println(s1.hashCode() + " " + s2.hashCode());

        String s3 = new String("Das ist das Haus von Nikigraus!"); // Objekt landet nicht im Pool!

        System.out.println(s1 == s3);       // Referenzvergleich
        System.out.println(s1.equals(s3));  // Wertevergleich
        System.out.println(s1.hashCode() + " " + s3.hashCode()); // HashCode zeigt nur das es Vergleichkandidaten sind

        // Wenn zwei Objekte per equals gleich sind, MÜSSEN sie den gleichen HashCode haben

        LocalDate ld1 = LocalDate.of(2000, 10, 15);
        LocalDate ld2 = LocalDate.of(2000, 10, 15);

        System.out.println(ld1 == ld2);       // Referenzvergleich
        System.out.println(ld1.equals(ld2));  // Wertevergleich
        System.out.println(ld1.hashCode() + " " + ld2.hashCode());

        String s4 = "";
        String s5 =  "";
        for(int i = 0; i < 1000; i++) {
            s4 += ".";
            s5 = s5.concat(".");

        }

        System.out.println(s5);
        System.out.println(s4);

        String d = "Das ist ein Test";
        d = d.toLowerCase();
        System.out.println(d);

        var x = 10; // var ist ab Java 10 verfügbar und ermittel den Datentyp zur Compilezeit
        var y = "Hallo"; // hier ist es ein String


        System.out.println(x + y);

        Object o = "Hallo Welt"; // String ist von Objekt abgeleitet
        o = 123; // Integer ist von Objekt abgeleitet
        o = new ArrayList(); // ArrayList ist von Objekt abgeleitet

    }
}
