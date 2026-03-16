package btvn.bai5;

import java.util.Scanner;

public class CODPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Thanh toán COD: " + amount);
    }

    public String getName() {
        return "COD";
    }
}
