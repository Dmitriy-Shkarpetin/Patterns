package creational.builder;

public class TestBuilder {
    public static void main(String[] args) {
        // Функция main() выступает в роли клиента
        // 1. Объявить ссылку на комплексное число (продукт)
        Complex C;

        // 2. Создать конкретный экземпляр класса ConcreteBuilder
        ConcreteBuilder B = new ConcreteBuilder();

        // 3. Создать класс-распорядитель и сконфигурировать его продуктом B
        Director D = new Director();
        D.Construct(B);

        // 4. Передать созданный продукт клиенту
        C = B.GetResult();

        // 5. Вывести значение комплексного числа (для проверки)
        System.out.println("C.re = " + C.re);
        System.out.println("C.im = " + C.im);
    }
}
