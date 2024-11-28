package Classes;

/*
Задача 4: Класс для человека
Описание задачи:
Создайте класс Person, который будет представлять человека. Класс должен содержать:
Поля:
Имя (name) — строка.
Возраст (age) — целое число.
Пол (gender) — строка (например, "мужчина" или "женщина").
Город (city) — строка.
Несколько конструкторов:
Конструктор, принимающий только имя.
Конструктор, принимающий имя и возраст.
Конструктор, принимающий все поля.
Методы:
Геттеры и сеттеры для всех полей.
Переопределите методы equals и hashCode так, чтобы люди считались равными, если у них совпадают имя и возраст.
 */

public class Person {
    private String name;   // Имя
    private int age;       // Возраст
    private String gender; // Пол
    private String city;   // Город

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    // Геттеры и сеттеры для всех полей
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Сравнение ссылок
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и класс
        Person person = (Person) obj; // Приведение типа
        return age == person.age && Objects.equals(name, person.name); // Сравнение имени и возраста
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Генерация хэш-кода на основе имени и возраста
    }


    public static void main(String[] args) {
        Person person1 = new Person("Иван", 30, "мужчина", "Москва");
        Person person2 = new Person("Иван", 30, "мужчина", "Санкт-Петербург");
        Person person3 = new Person("Анна", 25, "женщина", "Москва");

        // Сравнение людей
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // false

        // Вывод информации о людях
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }

}
