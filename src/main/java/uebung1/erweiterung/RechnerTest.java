package uebung1.erweiterung;



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

            Rechner.addieren(a, b);
            Rechner.subtrahieren(a, b);
            Rechner.multiplizieren(a, b);
            Rechner.dividieren(a, b);

        } catch (InputMismatchException e) {
            System.out.println("Falsche eingabe");


        } finally {
            scanner.close();
            Rechner.druckeProtokoll();
            System.out.println("Bye Bye!");

        }


    }
}
