package btvn.kha;

public class EmailService {
    public void sendOrderConfirmation(Order order) {
        String customerEmail = order.getCustomer().getEmail();
        String message = "Đơn hàng " + order.getOrderId() + " đã được tạo";

        System.out.println("Đã gửi email đến " + customerEmail + ": " + message);
    }
}
