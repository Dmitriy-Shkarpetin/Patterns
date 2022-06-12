package creational.builder;
// Класс, который есть конкретным строителем

class ConcreteBuilder extends Builder {
    // Ссылка
    private Complex currentBuilder;

    // Конструктор
    ConcreteBuilder() {
        currentBuilder = null;
    }

    // Переопределение методов, которые определены в классе Builder
    void CreateComplex() {
        System.out.println("ConcreteBuilder.CreateComplex()");
        currentBuilder = new Complex();
    }

    // Построить часть 1
    void BuildPart1(int part1) {
        currentBuilder.re = part1;
    }

    // Построить часть 2
    void BuildPart2(int part2) {
        currentBuilder.im = part2;
    }

    // Вернуть комплексное число для клиента
    Complex GetResult() {
        return currentBuilder;
    }
}
