package structural.decorator;

/**
 * Алгоритм создания примера:
 * 1. Создаем интерфейс «Форма»
 * 2. Класс «Прямоугольник» и класс «Окружность»  -  конкретными классами, реализующие интерфейс «Форма»
 * 3. «ShapeDecorator» — это наш абстрактный класс декоратора, реализующий тот же интерфейс «Shape».
 * 4. Создаем конкретный класс декоратора, расширяющий указанный выше абстрактный класс декоратора.
 * «ShapeDecorator» — это наш абстрактный класс декоратора, реализующий тот же интерфейс «Shape».
 * 5. Теперь используйте конкретный класс декоратора, созданный выше, для декорирования объектов интерфейса.
 * RedShapeDecorator — это конкретный класс, реализующий ShapeDecorator.
 * 6. DecoratorPatternDemo, наш демонстрационный класс будет использовать RedShapeDecorator для украшения объектов Shape.
 */
public class DecoratorPatternDemo {

    // Main driver method
    public static void main(String[] args) {
        // Creating an object of Shape interface
        // inside the main() method
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        // Display message
        System.out.println("Circle with normal border");

        // Calling the draw method over the
        // object calls as created in
        // above classes

        // Call 1
        circle.draw();

        // Display message
        System.out.println("\nCircle of red border");

        // Call 2
        redCircle.draw();

        // Display message
        System.out.println("\nRectangle of red border");

        // Call 3
        redRectangle.draw();
    }
}