package creational.singltone;

public class Run {
    public static void main(String[] args) {
        try {

            System.out.println("Logging started\n");
            // получаем доступ к объекту логирования
            Logger refLogger = Logger.GetInstance();
            // записываем данные о логировании
            refLogger.PutMessage("This is first");
            refLogger.PutMessage("This is second");
            System.out.println("Logging ended\n");

        } catch (Exception ex) {
            System.out.println("Exception happened! Exception description\n" + ex.getMessage());
        }
    }
}
