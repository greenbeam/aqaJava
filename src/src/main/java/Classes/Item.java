package Classes;
/*
Задача 3: Класс для представления единицы товара
Описание:
Создайте класс Item, который будет представлять товар.
Класс должен содержать:
Поля:
Название товара (name).
Цена товара (price).
Количество на складе (quantity).
Методы:
sell(int amount): уменьшает количество на складе на заданное значение, если достаточно товара.
restock(int amount): добавляет указанное количество на склад.
getInfo(): возвращает строку с информацией о товаре.
 */

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Метод для продажи товара
    public void sell(int amount) {
        if (amount > 0) {
            if (amount <= quantity) {
                quantity -= amount;
                System.out.println("Продано " + amount + " единиц товара '" + name + "'. Остаток на складе: " + quantity);
            } else {
                System.out.println("Недостаточно товара на складе для продажи " + amount + " единиц. Доступно: " + quantity);
            }
        } else {
            System.out.println("Количество для продажи должно быть положительным.");
        }
    }

    // Метод для пополнения склада
    public void restock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Пополнено " + amount + " единиц товара '" + name + "'. Новое количество на складе: " + quantity);
        } else {
            System.out.println("Количество для пополнения должно быть положительным.");
        }
    }

    // Метод для получения информации о товаре
    public String getInfo() {
        return "Товар: " + name + ", Цена: " + price + ", Количество на складе: " + quantity;
    }

    public static void main(String[] args) {
        Item item = new Item("Ноутбук", 1500.0, 10);

        // Вывод информации о товаре
        System.out.println(item.getInfo());

        // Продажа и пополнение товара
        item.sell(3);   // Продажа 3 единиц
        item.restock(5); // Пополнение на 5 единиц
        item.sell(15);  // Попытка продать 15 единиц

        // Вывод обновленной информации о товаре
        System.out.println(item.getInfo());
    }

}
