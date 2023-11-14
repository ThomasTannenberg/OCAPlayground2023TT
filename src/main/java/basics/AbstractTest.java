package basics;

public class AbstractTest {
    public static void main(String[] args) {
        //Fahrzeug f = new Fahrzeug();


        //polymorphie + upcasting
        Fahrzeug f2 = new PKW();

        f2.beschleunigen();

        f2 = new PKW();
        f2.beschleunigen();



    }
}

abstract class Fahrzeug {
    private String registration;
    private String makre;
    private int baujahr;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getMakre() {
        return makre;
    }

    public void setMakre(String makre) {
        this.makre = makre;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public abstract void beschleunigen();


    public abstract void bremsen();

}

class PKW extends Fahrzeug {
    @Override
    public void beschleunigen() {
        System.out.println("PKW beschleunigt um 10km/h");
    }

    @Override
    public void bremsen() {
        System.out.println("PKW bremst um 10km/h");
    }
}