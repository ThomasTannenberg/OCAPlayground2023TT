package uebung1.erweiterung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RechnerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double a;
            double b;

            try {
                System.out.println("Erste Zahl bitte:");
                a = scanner.nextDouble();
                System.out.println("Zweite Zahl bitte:");
                b = scanner.nextDouble();

                Rechner.addieren(a, b);
                Rechner.subtrahieren(a, b);
                Rechner.multiplizieren(a, b);
                Rechner.dividieren(a, b);


                System.out.println("Fortfahren? (ja/nein)");
                String antwort = scanner.next();
                if (antwort.equalsIgnoreCase("nein")) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Falsche Eingabe");
                scanner.next();
            }
        }


        Rechner.druckeProtokoll();
        System.out.println("Bye Bye!");
        scanner.close();
    }
}
