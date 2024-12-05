package Refactoring.Discounts;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
    private final Map<String, DiscountStrategy> discountStrategies;

    public DiscountCalculator() {
        discountStrategies = new HashMap<>();
        discountStrategies.put("regular", new RegularCustomerDiscount());
        discountStrategies.put("vip", new VipCustomerDiscount());
        discountStrategies.put("employee", new EmployeeDiscount());
    }

    public double calculateDiscount(String customerType, double amount) {
        DiscountStrategy strategy = discountStrategies.get(customerType.toLowerCase());
        if (strategy != null) {
            return strategy.calculateDiscount(amount);
        }
        return 0;
    }
}