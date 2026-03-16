package btvn.kha;

import java.util.Map;

public class OrderCalculator {
    public long calculateTotal(Order order) {
        long total = 0;
        for (Map.Entry<Product, Integer> entry : order.getItems().entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }
}
