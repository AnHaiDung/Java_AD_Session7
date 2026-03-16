package btvn.bai4;

import java.util.Scanner;

public class EmailService implements NotificationService {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Gửi email " + recipient + ": " + message);
    }
}
