package UebungProdukteNeu;

public class Main {

    public static void main(String[] args) {

        Produkt test = new Produkt(1, "Apfel", "rot", 0.99, 200);
        ProduktListe.getInstance().addProdukt(test);


        System.out.println(ProduktListe.getInstance());

    }

}
