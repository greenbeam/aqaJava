package Structures;
import java.util.ArrayList;
import java.util.List;

/*
Разработать метод, который принимает список целых чисел и удаляет из него все четные числа.
*/


public class RemoveEvenNumbers {

    public static List<Integer> removeEvens(List<Integer> numbers) {

        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            // Если число нечетное, добавляем его в результат
            if (number % 2 != 0) {
                result.add(number);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        List<Integer> oddNumbers = removeEvens(numbers);

        System.out.println("Список нечетных чисел: " + oddNumbers);
    }

}
