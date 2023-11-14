package basics;

public class DestructorTest {
    public static void main(String[] args) throws InterruptedException {


        DestructorTest dt = new DestructorTest();
        dt = null; // Referenz auf das Objekt entfernt


        System.gc(); // Fordert die Müllabfuhr tätig zu werden

        Thread.sleep(10000);




    }

    @Override
    protected  void finalize() throws Throwable {
        System.out.println("ARRRRRRGGG.... bis weg!");
    }
}
