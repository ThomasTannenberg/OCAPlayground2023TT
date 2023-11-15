package Uebung3;
import java.util.Random;
class Monster {
    private int x, y;
    private static Random random = new Random();

    public Monster() {

        x = random.nextInt(Spielfeld.GROESSE);
        y = random.nextInt(Spielfeld.GROESSE);
    }

    public void bewege(int roboterX, int roboterY) {

        if (x < roboterX) {
            x++;
        } else if (x > roboterX) {
            x--;
        }

        if (y < roboterY) {
            y++;
        } else if (y > roboterY) {
            y--;
        }


        if (x == roboterX && y == roboterY) {
            System.out.println("GAME OVER: YOU WERE EATEN");
            System.exit(0);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
