package E_commerce;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Ritick");

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mobile", 20000);

        Order o1 = new Order(123);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(124);
        o2.addProduct(p1);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c1.displayOrders();;

    }
}
