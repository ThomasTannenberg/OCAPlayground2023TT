package uebung1.erweiterung;



import java.util.InputMismatchException;
import java.util.Scanner;

public class RechnerTestErweiterung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 0;
        double b = 0;

        try {
            System.out.println("Erste Zahl bitte:");
            a = scanner.nextDouble();
            System.out.println("Zweite Zahl bitte:");
            b = scanner.nextDouble();

            RechnerErweiterung.addieren(a, b);
            RechnerErweiterung.subtrahieren(a, b);
            RechnerErweiterung.multiplizieren(a, b);
            RechnerErweiterung.dividieren(a, b);

        } catch (InputMismatchException e) {
            System.out.println("Falsche eingabe");


        } finally {
            scanner.close();
            RechnerErweiterung.druckeProtokoll();
            System.out.println("Bye Bye!");

        }


    }
}
