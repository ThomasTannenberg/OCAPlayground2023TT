package basics;

public class StaticTest2 {

    public static Object o1 = new Object();
    public Object o2 = new Object();

    public static void main(String[] args) {

        StaticTest2 st1 = new StaticTest2();
        StaticTest2 st2 = new StaticTest2();
        st2 = null;







        //siehe Keynot 3
    }

//    public void machWas(){
//        System.out.println("mach was");
//        System.out.println(o1); //statische Variablen , Klassenvariable
//        System.out.println(o2); //Instanzvariablen
//    }

//    public static void machWas(){
//        System.out.println("mach was");
//        System.out.println(o1); //statische Variablen , Klassenvariable
//        System.out.println(o2); //Instanzvariablen - hier nicht möglich
//    }

}
