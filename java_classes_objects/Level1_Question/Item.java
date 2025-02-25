package Level1_Question;

public class Item {
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {

        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Display the details
    public void displayDetails() {

        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {

        Item item = new Item("X123", "Laptop", 75000);
        item.displayDetails();

        int quantity = 5;

        System.out.println("Total Cost for " + quantity + " items: " + item.calculateTotalCost(quantity));
    }
}
