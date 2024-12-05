package Refactoring.Discounts;


public class DiscountCalculatorTest {
    public static void main(String[] args) {

        DiscountCalculator calculator = new DiscountCalculator();
        double amount = 100.0;
        double expectedDiscount = 5.0; // 5% от 100
        double actualDiscount = calculator.calculateDiscount("regular", amount);
        System.out.println(expectedDiscount);
        System.out.println(actualDiscount);

        DiscountCalculator calculatorVip = new DiscountCalculator();
        double amountVip = 200.0;
        double expectedDiscountVip = 20.0;
        double actualDiscountVip = calculator.calculateDiscount("vip", amountVip);
        System.out.println(expectedDiscountVip);
        System.out.println(actualDiscountVip);

        DiscountCalculator calculatorEmployee = new DiscountCalculator();
        double amountEmployee = 300.0;
        double expectedDiscountEmployee = 90.0;
        double actualDiscountEmployee = calculator.calculateDiscount("employee", amount);
        System.out.println(expectedDiscountEmployee);
        System.out.println(actualDiscountEmployee);


    }
}
