package Structures;
import java.util.LinkedList;
import java.util.Queue;
/*
Разработать метод, который использует очередь для ротации элементов массива вправо на n позиций.
 */

public class ArrayRotation {
    public static int[] rotateArray(int[] arr, int n) {
        if (arr == null || arr.length == 0 || n <= 0) {
            return arr;
        }

        int length = arr.length;
        n = n % length;

        Queue<Integer> queue = new LinkedList<>();

        for (int num : arr) {
            queue.offer(num);
        }

        for (int i = 0; i < length; i++) {
            if (i < n) {
                // Перемещаем элементы в конец очереди
                queue.offer(queue.poll());
            } else {
                arr[i - n] = queue.poll();
            }
        }

        for (int i = length - n; i < length; i++) {
            arr[i] = queue.poll();
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Исходный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        rotateArray(array, n);

        System.out.println("\nМассив после ротации вправо на " + n + " позиций:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
