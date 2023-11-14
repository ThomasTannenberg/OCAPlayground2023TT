package basics;

public class FinalTest {

    //Instanz und Klassenvariable bekommen defaultwerte
    int zahl; // default wird zugewiesen.

    //primite Datentypen:
    //byte, int, shot, long --> 0
    //float, double --> 0.0
    //boolean --> false
    //char --> Erstes Zeichen UniCode (nichts)
    //komplexe Datentypen --> null


    public static void main(String[] args) {
        final int i = 10; // Konstante kann nicht geändert werden

        // Lokale Variablen bekommen KEINE default WERTE!

        // komplexe Datentypen:
        String a; //nicht initialisiert - kann nicht benutzt werden
        String b = null; // Ist eine NULL-_Referenz. Produizert fehler
        String c = ""; // Referenz auf ein String Objekt. Literal Schreibweise.

        //i = 20; // ERROR!

        final int zahlen[] = new int[10]; // array mit 10 stellen
        //zahlen[] = new int[5]; // Neuzuweisung ist nicht erlaubt, da final
        // die Variable zahlen kann kein neues Array zugewiesen bekommen
        // Inhalt des Arrays darf sich aber ändern

        zahlen[0] = 15;
        zahlen[1] = 1;
        zahlen[2] = 18;
        zahlen[3] = 22;

        for(int j = 0; j < zahlen.length; j++){
            System.out.println(zahlen[j]);
        }

        Math.abs(10);
    }
}
