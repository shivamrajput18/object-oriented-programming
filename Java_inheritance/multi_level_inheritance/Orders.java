package Java_inheritance.multi_level_inheritance;

import java.sql.Date;

// Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
// Tasks:
// Define a base class Order with common attributes like orderId and orderDate.
// Create a subclass ShippedOrder with additional attributes like trackingNumber.
// Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
// Implement a method getOrderStatus() to return the current order status based on the class level.
// Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.

class Order {
    protected String orderId;
    protected String orderDate;

    Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Order id: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

}

class ShippedOrder extends Order{
    public String trackingNumber;
    ShippedOrder(String orderId, String orderDate, String trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public void getOrderStatus() {
        
        System.out.println("Tracking Number: "+ this.trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        System.out.println( "Order delivered on " + deliveryDate);
    }
}



public class Orders {
    public static void main(String[] args) {
        Order order = new Order("ORD123", "2025-02-20");
        order.getOrderStatus();

        System.out.println("\n=== Shipped Order Details ===");
        
        // Order shipped
        ShippedOrder shippedOrder = new ShippedOrder("ORD123", "2025-02-20", "TRK98765");
        shippedOrder.getOrderStatus();

        System.out.println("\n=== Delivered Order Details ===");
        
        // Order delivered
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD123", "2025-02-20", "TRK98765", "2025-02-23");
        deliveredOrder.getOrderStatus();
    }
}
