package UebungProdukteNeu;

public class Main {

    public static void main(String[] args) {

        Produkt test = new Produkt("Apfel", "rot", 0.99, 200);
        Produkt test1 = new Produkt("Apfel", "rot", 0.99, 200);
        Produkt test2 = new Produkt("Apfel", "rot", 0.99, 200);
        Produkt test3 = new Produkt("Apfel", "rot", 0.99, 200);
        VerderblichesProdukt test4 = new VerderblichesProdukt("Hackfleisch", "roh", 2.99, 100);
        ProduktListe.getInstance().addProdukt(test);
        ProduktListe.getInstance().addProdukt(test1);
        ProduktListe.getInstance().addProdukt(test2);
        ProduktListe.getInstance().addProdukt(test3);
        ProduktListe.getInstance().addProdukt(test4);


        System.out.println(ProduktListe.getInstance());

        ProduktListe.getInstance().safeToJson();

    }

}
