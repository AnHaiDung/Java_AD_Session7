package btvn.bai3;

import java.util.Scanner;

public class PaymentProcessor {
    public void process(PaymentMethod paymentMethod, int amount){
        paymentMethod.paymentProcess(amount);
    }
}
