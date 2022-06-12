package creational.builder;
// Класс-распорядитель
class Director {
    // Метод, конструирующий части,
    // получает ссылку на класс, который реализует интерфейс с клиентом
    void Construct(Builder builder) {
        // Создать продукт
        builder.CreateComplex();

        // Построить часть 1
        builder.BuildPart1(15);

        // Построить часть 2
        builder.BuildPart2(30);
    }
}
