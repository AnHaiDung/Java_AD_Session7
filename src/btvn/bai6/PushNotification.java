package btvn.bai6;

import java.util.Scanner;

public class PushNotification implements NotificationService{
    public void notifyCustomer(String message) {
        System.out.println("Gửi push notification: " + message);
    }
}
