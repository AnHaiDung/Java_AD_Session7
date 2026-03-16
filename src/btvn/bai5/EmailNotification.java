package btvn.bai5;

import java.util.Scanner;

public class EmailNotification implements NotificationService {
    public void send(String message, Customer customer) {
        System.out.println("Đã gửi email xác nhận");
    }
}
