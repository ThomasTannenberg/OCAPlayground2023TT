package uebung5a;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    private static final String LOG_FILE = "log.txt";
    private static final Logger instance = new Logger();
    private StringBuilder logSB = new StringBuilder();

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    public void logStart(String message) {

        String type = "DEBUG";
        String methodName = Logger.getMethodName();
        String className = Logger.getClassName();
        String time = LocalDateTime.now().format(FMT);


            logSB.append(time).append(": ").append(type).append(" - ").append(className).append("/").append(methodName).append(" - ").append(message).append("\n");
    }

    private static String getMethodName() {
        return new Throwable().getStackTrace()[2].getMethodName();
    }

    private static String getClassName() {

        return new Throwable().getStackTrace()[2].getClassName();
    }


    public void saveLogToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE))) {
            writer.write(logSB.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


