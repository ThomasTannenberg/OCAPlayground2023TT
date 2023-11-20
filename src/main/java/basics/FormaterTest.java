package basics;

import java.time.format.DateTimeFormatter;

public class FormaterTest {


    public static final DateTimeFormatter FMT_DATE_TIME = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    public static final DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static final DateTimeFormatter FMT_TIME = DateTimeFormatter.ofPattern("HH:mm:ss");

    public FormaterTest() {
    }
}

class LocalDate{
    public static void main(String[] args) {
        LocalDate ld = new LocalDate();
        //....
        System.out.println();
    }


    int myInt = 500;
    Integer myInteger = myInt; // Autoboxing von int zu Integer



}
