package basics;

public class NullPointerTest {

    private static String s = "Hallo Test";

    public static void main(String[] args) {


        //String S = "Hallo Test";
        //Alle operationen auf eine Null-Referenz führen zu einer
        //NullPointerException

        //s.toLowerCase(); // null-Referenz von String S führt zu NullPointerException

        if (s != null) {
            s.toLowerCase();
        }


    }
}
