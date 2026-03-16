package btvn.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod momo = new MomoPayment();
        processor.process(momo,5000);

        PaymentMethod cod = new CODPayment();
        processor.process(cod, 250000);

        PaymentMethod card = new CreditCardPayment();
        processor.process(card, 1800000);
    }
}
