package basics;

public class HashCodeTest {
    public static void main(String[] args) {

        Object o = new Object();
        // Wenn ein Objekt ausgegeben wird muss es erstmal in String konvertiert werden
        // Passiert automatisch durch Aufruf von toString();
        System.out.println(o);

    int i = 245341651;
        System.out.println("Hex von: "+ i + " ist: " + Integer.toHexString(i)); //Wandelt von Dezimal in HEX



        String a = "Hallo Welt";
        String b = new String("Hallo Welt");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        // Object vererbt an jedes Objekt: hashCode(); equals, toString, getClass, wait, notify, notifyAll, wait
        User u = new User();
        u.hashCode();

        System.out.println(u); // to.String methode. Hier überschrieben in der User Klasse.



    }
}
