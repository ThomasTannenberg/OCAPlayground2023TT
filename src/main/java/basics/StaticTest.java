package basics;

public class StaticTest {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MA:AB 123", "Fiat");
        Vehicle v2 = new Vehicle("LU:CD 123", "Audi");
    }


}

class Vehicle {

    private String registration;
    private String brand;

    private int id;

    private static int count; //statische Eigenschaften existieren nur in der Klasse!!!

    public String getRegistration() {
        return registration;
    }

    public String getBrand() {
        return brand;
    }

    public Vehicle(String registration, String brand) {
        this.registration = registration;
        this.brand = brand;
        this.id = ++count;
    }

//    public Vehicle(String registration, String brand) {
//        this.registration = registration;
//        this.brand = "Unbekannt";
//        this.id = ++count;
//    }

    public Vehicle(String registration) {
        //Falls ein anderer Konstruktor verwendet wird, muss es die erste Anweisung im Konstruktor sein!
        this(registration, "Unbekannt"); // ruft den anderen Konstruktor auf
    }

}
