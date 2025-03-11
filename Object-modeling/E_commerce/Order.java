package E_commerce;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private List<Product> products;

    public Order(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + id);
        for (Product prod : products) {
            System.out.println(prod.getName() + " - " + prod.getPrice());
        }
    }
    

}
