package Base;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");

        int N = scanner.nextInt();
        System.out.print("Простые числа: ");

        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;

            // Проверяем делимость num на все числа от 2 до sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Если нашли делитель, выходим из цикла
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
