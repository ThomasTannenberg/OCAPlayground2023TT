package Uebung7.Kalender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kalender {
    private final List<Termin> termine;

    public Kalender() {
        termine = new ArrayList<>();
    }

    public void addTermin(Termin termin) {
        termine.add(termin);
        Collections.sort(termine);
    }

    public void displayAllTermine() {
        for (Termin termin : termine) {
            System.out.println(termin);
        }
    }

    public void displayTermineForDate(LocalDate date) {
        for (Termin termin : termine) {
            if (termin.getTime().toLocalDate().equals(date)) {
                System.out.println(termin);
            }
        }
    }
}

