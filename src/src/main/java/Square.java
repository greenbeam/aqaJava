import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ширина: ");
        int width = scanner.nextInt();

        System.out.println("Длина: ");
        int length = scanner.nextInt();

        int area = width * length;

        System.out.println("Площадь: " + area);

        scanner.close();

    }
}
