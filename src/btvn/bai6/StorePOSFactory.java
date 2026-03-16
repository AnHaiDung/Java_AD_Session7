package btvn.bai6;

import java.util.Scanner;

public class StorePOSFactory implements SalesChannelFactory{
    public DiscountStrategy createDiscount() {
        return new MemberDiscount();
    }

    public PaymentMethod createPayment() {
        return new CashPayment();
    }

    public NotificationService createNotification() {
        return new PrintInvoiceNotification();
    }
}
