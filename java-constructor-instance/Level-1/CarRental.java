public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 5000.0; // Fixed daily rental rate

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }


    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    // Display rental details
    public void displayRental() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $ " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Using default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRental();

        System.out.println();

        // Using parameterized constructor
        CarRental customRental = new CarRental("John Doe", "Toyota Camry", 5);
        System.out.println("Custom Rental:");
        customRental.displayRental();

        System.out.println();

        
        
        
        
    }
}
