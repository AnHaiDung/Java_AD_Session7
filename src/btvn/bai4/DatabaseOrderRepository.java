package btvn.bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatabaseOrderRepository implements OrderRepository {
    private List<Order> orderList = new ArrayList<>();

    @Override
    public void save(Order order) {
        orderList.add(order);
        System.out.println("lưu đơn hàng vào database : " + order.id);
    }

    @Override
    public List<Order> findAll() {
        return List.of();
    }
}
