import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 * Класс для записи действий в лог
 * Для записи используется метод logEvent. Принимает параметр сообщения для логирования
 */
public class Logs {
    private static final Logger logger = Logger.getLogger(Logs.class.getName());

    static {
        try {
            // Создание объекта FileHandler и указание пути к файлу лога
            FileHandler fileHandler = new FileHandler("log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());

            // Установка уровня логирования, чтобы отфильтровать сообщения ниже этого уровня
            logger.setLevel(Level.INFO);

            // Удаление стандартного обработчика для консоли
            logger.setUseParentHandlers(false);

            // Добавление пользовательского обработчика файла в логгер
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            System.out.println("Ошибка при создании FileHandler: " + e.getMessage());
        }
    }

    public void logEvent(String event) {
        // Запись события в лог
        logger.info(event);
    }
}