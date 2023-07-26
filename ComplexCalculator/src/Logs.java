import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logs {
    private static String fileName = "log.txt";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public void logEvent(String event) {
        String timeStamp = dateFormat.format(new Date());
        String logMessage = timeStamp + " - " + event;
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(logMessage);
        } catch (IOException e) {
            System.out.println("Ошибка при записи лога: " + e.getMessage());
        }

        
    }
}
