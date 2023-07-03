package Interfaces;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
/**
 * Интерфейс для описания логирования
 */
public interface iLogAction {
    /**
     * Создание метода лога
     * @return возвращает объект логера
     */
    Logger createLogger();
    /**
     * Логирование события
     * @param logger передаем класс логера
     * @param message сообщение для записи
     * @param level уровень
     */
    void LogEvent(Logger logger, String message, Level level);
}
