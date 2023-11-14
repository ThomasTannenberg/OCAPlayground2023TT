package basics.de.gfn.java.basics;

import java.util.*; //Alle Klassen aus java.util werden importiert

//Statische Imports importieren Eigenschaften und Methoden
import static java.lang.System.out;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static basics.de.gfn.java.basics.Wochentag.*;

public class ImportTest {

    private int zahl = 10; //Klassenvariable!!!

    private static int zahl2 = 20; //Objectvariable!!!

    public static void main(String[] args) {
        Date d = new Date();

        out.println(zahl2);

        System.out.println("Hallo OUT");

        StringBuilder sb = new StringBuilder();
        sb.append("Hallo").append(123).append("Welt");   // Object changing!!!

        out.println("Hi");

        //Math.PI;

        out.println(PI); // statisch importierte Eigenschaft
        out.println(pow(5,2)); // statisch importierte Methode

        out.println(MO); // aus der enum Klasse





    }
}
