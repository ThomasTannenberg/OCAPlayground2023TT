package uebung2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            WuerfelbecherE becher = new WuerfelbecherE();
            becher.spielen();
            System.out.println("Möchten Sie erneut spielen? (ja/nein)?");
            String antwort = new Scanner(System.in).nextLine();

            if(antwort.equalsIgnoreCase("ja")) {
                continue;
            }
            if(antwort.equalsIgnoreCase("nein")) {
                break;
            }
        }





    }
}
