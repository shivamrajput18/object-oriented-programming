package Level1_Question;

// Program to Handle Mobile Phone Details

// Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object.

public class Mobile {
    private String brand;
    private String model;
    private double price;

    // Constructor
    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Display the details
    public void displayDetails() {
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Price is: " + price);
    }

    public static void main(String[] args) {

        // Createing a Mobile object
        Mobile m1 = new Mobile("Samsung", "J7", 14000);
        Mobile m2 = new Mobile("Iphone", "13", 800000);

        m1.displayDetails();
        m2.displayDetails();

    }
}
