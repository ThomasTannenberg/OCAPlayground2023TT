package designpatterns.singleton;

public class Singletontest {

    public static void main(String[] args) {

        //Singleton = Es gibt das Objekt nur einmal!
        EagerSingletons es1 = EagerSingletons.getInstance();
        EagerSingletons es2 = EagerSingletons.getInstance();
        EagerSingletons es3 = EagerSingletons.getInstance();

        es1.setI(10);
        System.out.println(es2.getI());
        es3.setI(25);
        System.out.println(es1.getI());


    }



}


//EagerSingletons
class EagerSingletons{

    // Klasse enthält eine Referenz auf ein Objekt
    private static final EagerSingletons instance = new EagerSingletons();

    private int i;

    private EagerSingletons(){}

    public static EagerSingletons getInstance(){
        return instance;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}




//LazySingletons
class LazySingletons{



}
