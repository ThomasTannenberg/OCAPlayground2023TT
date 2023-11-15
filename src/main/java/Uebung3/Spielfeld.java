package Uebung3;

import java.util.ArrayList;
import java.util.List;

public class Spielfeld {
    public static final int GROESSE = 10;
    public static int runde = 0;

    private static List<Monster> monsterListe = new ArrayList<>();


    public static int[][] erstelleSpielfeld() {
        int[][] spielfeld = new int[GROESSE][GROESSE];
        for (int i = 0; i < GROESSE; i++) {
            for (int j = 0; j < GROESSE; j++) {
                spielfeld[i][j] = 0;
            }
        }
        return spielfeld;
    }

    public static void druckeSpielfeld(int x, int y) {
        bewegeKonsole();
        int[][] spielfeld = updateSpielfeld(x, y);
        for (int i = 0; i < GROESSE; i++) {
            for (int j = 0; j < GROESSE; j++) {
                if (spielfeld[i][j] == 8) {
                    //Rot: danke StackOverflow
                    System.out.print("\033[31m" + spielfeld[i][j] + "\033[0m" + " ");
                } else {
                    System.out.print(spielfeld[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("__________________");
    }

    public static int[][] updateSpielfeld(int x, int y) {
        int[][] spielfeld = erstelleSpielfeld();
        spielfeld[x][y] = 8;
        return spielfeld;
    }

    public static void bewegeKonsole() {
        for (int j = 0; j < 2; j++) {
            System.out.println("\n");
        }

        runde++;
        System.out.println("__________________");
        System.out.println("Runde: " + runde);

    }

}




