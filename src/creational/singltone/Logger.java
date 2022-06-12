package creational.singltone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

/**
 * Класс журнала событий программы.
 * Предназначение - запись событий в специальный текстовый файл.
 * В программе может существовать только в одном экземпляре.
 */

public class Logger {

    // конструктор закрыт, чтобы нельзя было создать копию объекта в обход специального метода
    private Logger() {
    }

    // указатель на будущий объект логера
    static Logger refInstance;

    // статический метод для получения доступа к объекту логирования
    // Объект создается, если он не существовал. Если он существовал возвращается ссылка на уже созданный объект
    public static Logger GetInstance() {
        if (refInstance == null) {
            refInstance = new Logger();
        }
        return refInstance;
    }

    // метод для записи строк в лог-файл
    public void PutMessage(String message) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(new FileOutputStream("logsingleton.txt", true))) {
            out.print(message + "\n" + LocalDateTime.now().toString() + "\n");
        }

    }
}

