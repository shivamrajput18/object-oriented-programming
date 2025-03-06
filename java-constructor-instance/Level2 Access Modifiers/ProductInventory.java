package Level2;

// Problem 1: Product Inventory

// Create a Product class with:
// Instance Variables: productName, price.
// Class Variable: totalProducts (shared among all products).
// Methods:
// An instance method displayProductDetails() to display the details of a product.
// A class method displayTotalProducts() to show the total number of products created.

class Products {
    String productName;
    int price;
    static int totalProducts;

    // parematrized constructor
    Products(String productName, int price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("ProductName: " + this.productName);
        System.out.println("Price: " + this.price);
    }

    static void displayTotalProducts() {
        System.out.println("Total: " + totalProducts);
    }

}

public class ProductInventory {
    public static void main(String[] args) {
        Products p1 = new Products("laptop", 70000);
        Products p2 = new Products("tv", 40000);

        p1.displayProductDetails();

        Products.displayTotalProducts();

    }
}
