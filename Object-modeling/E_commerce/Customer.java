package E_commerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;


    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public void displayOrders() {
        System.out.println("Customer: " + name);
        for (Order ord : orders) {
            ord.displayOrder();
        }
    }

}
