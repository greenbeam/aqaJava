import java.util.Scanner;

public class TimeOfTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца (1-12): ");

        int month = scanner.nextInt();
        String season;

        switch (month) {
            case 1: // Январь
            case 2: // Февраль
            case 12: // Декабрь
                season = "Зима";
                break;
            case 3: // Март
            case 4: // Апрель
            case 5: // Май
                season = "Весна";
                break;
            case 6: // Июнь
            case 7: // Июль
            case 8: // Август
                season = "Лето";
                break;
            case 9: // Сентябрь
            case 10: // Октябрь
            case 11: // Ноябрь
                season = "Осень";
                break;
            default:
                season = "Некорректный номер месяца. Пожалуйста, введите число от 1 до 12.";
        }

        System.out.println("Время года: " + season);
        scanner.close();
    }
}
