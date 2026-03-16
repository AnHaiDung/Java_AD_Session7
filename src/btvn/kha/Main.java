package btvn.kha;

public class Main {
    private static int orderCounter = 1;
    public static void main(String[] args) {
        Product laptop = new Product("SP01", "Laptop", 15000000);
        Product mouse  = new Product("SP02", "Chuột", 300000);

        System.out.println("Tạo sản phẩm: " + laptop.getId() + " - " + laptop.getName() + " - " + laptop.getPrice() + ", " + mouse.getId() + " - " + mouse.getName() + " - " + mouse.getPrice());
        System.out.println("Đã thêm sản phẩm\n");

        Customer customer = new Customer("Hai Dung", "dungan@gmail.com");
        System.out.println("Tạo khách hàng: " + customer.getName() + " - " + customer.getEmail());
        System.out.println("Đã thêm khách hàng\n");

        String orderId = String.format("ORD%03d", orderCounter++);
        Order order = new Order(orderId, customer);
        order.addItem(laptop, 1);
        order.addItem(mouse, 2);

        System.out.println("Tạo đơn hàng: SP01 (1 cái), SP02 (2 cái)");
        System.out.println("Đơn hàng " + orderId + " được tạo\n");

        OrderCalculator calculator = new OrderCalculator();
        long total = calculator.calculateTotal(order);
        order.setTotalAmount(total);

        System.out.println("Tính tổng tiền");
        System.out.println("Tổng tiền: " + total + "\n");

        EmailService emailService = new EmailService();
        System.out.println("Gửi email xác nhận");
        emailService.sendOrderConfirmation(order);

    }
}
