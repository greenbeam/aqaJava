package Refactoring.Discounts;
/*
Задание: подумать над улучшением кода
        Пример 1:

public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("regular")) {
            return amount * 0.05;
        } else if (customerType.equals("vip")) {
            return amount * 0.10;
        } else if (customerType.equals("employee")) {
            return amount * 0.30;
        } else {
            return 0;
        }
    }
}

 */