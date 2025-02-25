package Level2_Question;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    private static CartItem[] cart = new CartItem[100];
    private static int itemCount = 0;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Add item to the cart
    public static void addItemToCart(CartItem item) {
        if (itemCount < cart.length) {
            cart[itemCount] = item;
            itemCount++;
            System.out.println("Item added: " + item.getItemName());
        } else {
            System.out.println("Cart is full!");
        }
    }

    // Display the cart details
    public static void displayCartDetails() {
        double totalCost = 0.0;
        System.out.println("Shopping Cart Details:");
        for (int i = 0; i < itemCount; i++) {
            CartItem item = cart[i];
            System.out.println("Item: " + item.getItemName() + ", Price: " + item.getPrice() + ", Quantity: " + item.getQuantity());
            totalCost += item.getPrice() * item.getQuantity();
        }
        System.out.println("Total Cost: " + totalCost);
    }

    // Remove the item from cart item
    public static void removeItemFromCart(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].getItemName().equalsIgnoreCase(itemName)) {
                for (int j = i; j < itemCount - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[itemCount - 1] = null;
                itemCount--;
                System.out.println("Item removed: " + itemName);
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Creating the CatrtItem object
        CartItem item1 = new CartItem("Apple", 10.0, 2);
        CartItem item2 = new CartItem("Banana", 5.0, 5);

        addItemToCart(item1);
        addItemToCart(item2);

        displayCartDetails();

        removeItemFromCart("Apple");
        displayCartDetails();
    }
}
