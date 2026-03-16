package btvn.bai3;

import java.util.Scanner;

public class CODPayment implements CODPayable{

    @Override
    public void paymentProcess(int amount) {
        System.out.println("xu ly thanh toán COD"+ amount);
    }
}
