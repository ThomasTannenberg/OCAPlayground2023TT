package basics;

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
    }
}
