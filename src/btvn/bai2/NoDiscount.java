package btvn.bai2;

import java.util.Scanner;

public class NoDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount;
    }
}
