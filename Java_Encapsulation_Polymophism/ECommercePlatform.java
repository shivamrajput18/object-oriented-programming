package Java_Encapsulation_Polymophism;

// Abstract class Product
abstract class Product {
    private String productId; // Encapsulated field
    private String name; // Encapsulated field
    private double price; // Encapsulated field

    // Constructor
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();
}

// Interface Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class extending Product and implementing Taxable
class Electronics extends Product implements Taxable {
    private String brand;

    public Electronics(String productId, String name, double price, String brand) {
        super(productId, name, price);
        this.brand = brand;
    }

    @Override
    public double calculateDiscount() {
        // 10% discount for electronics
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        // 8% tax for electronics
        return getPrice() * 0.08;
    }

    @Override
    public String getTaxDetails() {
        return "8% tax applied on Electronics";
    }
}

// Clothing class extending Product and implementing Taxable
class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        // 5% discount for clothing
        return getPrice() * 0.05;
    }

    @Override
    public double calculateTax() {
        // 5% tax for clothing
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "5% tax applied on Clothing";
    }
}

// Groceries class extending Product
class Groceries extends Product {
    private String expiryDate;

    public Groceries(String productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculateDiscount() {
        // No discount for groceries
        return 0;
    }
}

// Main class to demonstrate the functionality
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create a list of products
        Product[] products = {
            new Electronics("E101", "Smartphone", 500.0, "Samsung"),
            new Clothing("C201", "T-Shirt", 25.0, "M"),
            new Groceries("G301", "Bread", 2.5, "2023-12-31")
        };

        // Calculate and print the final price for each product
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(((Taxable) product).getTaxDetails());
            }
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Product: " + product.getName() + ", Final Price: Rs," + finalPrice);
        }
    }
}