package basics;

import java.time.LocalDate;

public class UserTest {
    public static void main(String[] args) { // Einstiegspunkt für das Programm

        User user1 = new User(); // Objekt wird instanziert

        //user1.firstname = "Peter";
        user1.setFirstname("Peter");
        user1.setLastname("Parker");
        user1.setBirthDate(LocalDate.of(1990, 12, 12));

        System.out.println("Vorname: " + user1.getFirstname() +
                " Nachname: " + user1.getLastname() +
                " Geburtsdatum: " + user1.getBirthDate());


        User user2 = new User();
        System.out.println("Name: " + user2.getFirstname() +
                " Nachname: "  + user2.getLastname() +
                " Geburtsdatum: " + user2.getBirthDate());

        //Instanzmethode
        UserTest test = new UserTest();
        test.wortErweitern("Hallo");

        //Klassenmethode. Objekt wird nicht verwendet.
        wortStatischErweitern("Hallo");
    }


    //Instanzmethode. Instanzmethoden gehören einem Objekt
    public String /*Rückgabebetyp*/ wortErweitern(String wort/*Eingabetyp*/){
        wort += " erweitert...";
        return wort;
    }

    //KLassenmethoden: Gehören einer Klasse.
    public static String /*Rückgabebetyp*/ wortStatischErweitern(String wort/*Eingabetyp*/){
        wort += " erweitert...";
        return wort;
    }


}
