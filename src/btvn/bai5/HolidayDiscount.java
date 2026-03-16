package btvn.bai5;

import java.util.Scanner;

public class HolidayDiscount implements DiscountStrategy{
    public double applyDiscount(double total) {
        return total * 0.15;
    }

    public String getName() {
        return "Holiday 15%";
    }
}
