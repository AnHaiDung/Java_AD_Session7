package btvn.bai3;

import java.util.Scanner;

public class MomoPayment implements EWalletPayable{
    @Override
    public void paymentProcess(int amount) {
        System.out.println("xu ly thanh toán Momo "+ amount);
    }
}
