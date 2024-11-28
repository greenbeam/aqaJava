package Classes;
/*
Задача 1: Класс для представления прямоугольника
Описание:
Создайте класс Rectangle, который будет представлять прямоугольник.
Класс должен содержать:
Два поля: ширина (width) и высота (height).
Конструктор для инициализации ширины и высоты.
Методы:
calculateArea(): возвращает площадь прямоугольника.
calculatePerimeter(): возвращает периметр прямоугольника.
 */

public class Rectangle {
    private double width;
    private double height;

    // Конструктор для инициализации ширины и высоты
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Метод для расчета площади прямоугольника
    public double calculateArea() {
        return width * height;
    }

    // Метод для расчета периметра прямоугольника
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Периметр: " + rectangle.calculatePerimeter());
    }
}
