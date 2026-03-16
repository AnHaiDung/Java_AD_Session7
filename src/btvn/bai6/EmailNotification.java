package btvn.bai6;

import java.util.Scanner;

public class EmailNotification implements NotificationService  {
    public void notifyCustomer(String message) {
        System.out.println("Gửi email xác nhận: " + message);
    }
}
