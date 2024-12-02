package Structures;
import java.util.HashSet;
/*Написать функцию, которая принимает массив целых чисел и возвращает количество уникальных чисел в этом массиве.*/

public class UniqueNumbers {
    public static int countUniqueNumbers(int[] arr) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int num : arr) {
            uniqueNumbers.add(num);
        }

        return uniqueNumbers.size();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 4, 5};

        int uniqueCount = countUniqueNumbers(array);

        System.out.println("Количество уникальных чисел в массиве: " + uniqueCount);
    }

}
