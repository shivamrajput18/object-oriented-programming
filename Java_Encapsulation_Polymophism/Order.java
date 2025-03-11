package Java_Encapsulation_Polymophism;

// Online Food Delivery System
// Description: Create an online food delivery system:
// Define an abstract class FoodItem with fields like itemName, price, and quantity.
// Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().

// Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
// Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
// Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.

interface Discountable{
    void applyDiscount(int percent);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    abstract double calculateTotalPrice();

    void getItemDetails(){
        System.out.println("Item name: " + itemName);
        System.out.println("Item Price: " + price);
        System.out.println("Item quantity: " + quantity);
    }

    // Getter Methods
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}

class VegItem extends FoodItem implements Discountable{
    private double discountPercent;
    VegItem(String itemName, double price, int quantity){
        super(itemName, price, quantity);
        this.discountPercent = 0.0;
    }
    
    @Override
    double calculateTotalPrice() {
        double basePrice = getQuantity()*getPrice();
        
        return  basePrice * (1-discountPercent/100);
    }

    @Override
    public void applyDiscount(int percent) {
        if(percent > 0.0 && percent <=100){
            this.discountPercent = percent;
        }
    }
    @Override
    public String getDiscountDetails() {
        return "Applied discount is: " + discountPercent ;
    }
}
class NonVegItem extends FoodItem{
    private final double EXTRA_CHARGE_PERCENTAGE = 10.0;
    NonVegItem(String itemName, double price, int quantity){
        super(itemName, price, quantity);
    }
    @Override
    double calculateTotalPrice() {
        double basePrice = getQuantity()*getPrice();
        return  basePrice * (1-EXTRA_CHARGE_PERCENTAGE/100);
    }
}


public class Order{
    public static void main(String[] args) {
        FoodItem[] fooditems = {
            new VegItem("VegBurger", 70.0, 5),
            new NonVegItem("NonVegBurger ", 99.0, 4),
        };

        for(FoodItem item:fooditems){
            item.getItemDetails();
            if(item instanceof Discountable ){
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount(20);
                System.out.println(discountableItem.getDiscountDetails());
            }
            System.out.println("Total price: " + item.calculateTotalPrice() );
        }

    }
}