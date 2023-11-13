package uebung1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RechnerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 0;
        double b = 0;

        try {
            System.out.println("Erste Zahl bitte:");
            a = scanner.nextDouble();
            System.out.println("Zweite Zahl bitte:");
            b = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Falsche eingabe");
            return;

        } finally {
            scanner.close();

            System.out.println("Addition: " + Rechner.addieren(a, b));
            System.out.println("Subtraktion: " + Rechner.subtrahieren(a, b));
            System.out.println("Multiplikation: " + Rechner.multiplizieren(a, b));
            System.out.println("Division: " + Rechner.dividieren(a, b));

            System.out.println("Bye Bye!");
        }



    }
}


