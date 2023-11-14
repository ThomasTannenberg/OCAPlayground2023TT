package basics;

public class InitializerTest {

    public static final int ZAHL;

    public final int ANDERE_ZAHL;


    //statischer Initializer - wird nach dem laden der Klasse ausgeführt!
    static {
        ZAHL = 10;
    }



    // Instanz-Initializer - wird vor dem Konstruktor initialisiert.
    {
       //ANDERE_ZAHL = 200;
    }

    public InitializerTest() {
        //ZAHL = 10; // Zuweisung erfolgt zu spät!
        //Instanzen müssen spätesten im Konstruktor einen Wert bekommen
        ANDERE_ZAHL = 300;
    }
}
