package btvn.bai2;

import java.util.Scanner;

public class FixedDiscount implements DiscountStrategy {
    double percent;

    public FixedDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - totalAmount * percent / 100;
    }
}
