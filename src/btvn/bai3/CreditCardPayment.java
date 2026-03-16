package btvn.bai3;

import java.util.Scanner;

public class CreditCardPayment implements CardPayable{

    @Override
    public void paymentProcess(int amount) {
        System.out.println("xu ly thanh toán Card"+ amount);

    }
}
