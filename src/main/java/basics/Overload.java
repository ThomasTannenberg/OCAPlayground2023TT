package basics;

public class Overload {
    // nur über ein Objekt benutzbar
    public void doSomething(){
        System.out.println("doSomething");
    }

    public void doSomething(int x){
        System.out.println("doSomething " + x);
    }


    public static void main(String[] args) {

    Overload o = new Overload();
    o.doSomething();
    o.doSomething(3);



    }
}
