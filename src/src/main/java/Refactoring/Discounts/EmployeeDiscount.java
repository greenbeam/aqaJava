package Refactoring.Discounts;

public class EmployeeDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.30;
    }
}
