package Structures;

public class ArraySum {
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int result = sumArray(numbers);
        System.out.println("Сумма элементов массива: " + result);
    }
}
