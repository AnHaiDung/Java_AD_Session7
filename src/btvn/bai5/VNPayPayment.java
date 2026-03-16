package btvn.bai5;

import java.util.Scanner;

public class VNPayPayment implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Thanh toán VNPay: " + amount);
    }

    public String getName() {
        return "VNPay";
    }
}
