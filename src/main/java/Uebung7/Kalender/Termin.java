package Uebung7.Kalender;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Termin {

    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    private Kategorie kategorie; //ENUM: GESCHÄFTLICH, PERSÖNLICH, FREIZEIT
    private LocalDateTime time;
    private String name;
    private String description;

    private StringBuilder sb = new StringBuilder();

    public Termin(String time, String name, String description) {
        try {
            this.time = LocalDateTime.parse(time, FMT);
        } catch (Exception e) {
            System.out.println("Ungültiges Datumformat. Erwartetes Format: dd.MM.yyyy HH:mm" + e.getMessage());

        }
        this.name = name;
        this.description = description;
    }


    public LocalDateTime getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        sb.append("Termin{");
        sb.append("time=").append(time.format(FMT));
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
