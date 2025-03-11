package Java_Encapsulation_Polymophism;

interface GPS {
    void updateLocation(String location);
    String getCurrentLocation();
}


abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation; 

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    
    public abstract double calculateFare(double distance);

    
    public String getVehicleDetails() {
        return String.format("Vehicle ID: %s | Driver: %s | Rate per Km: $%.2f", vehicleId, driverName, ratePerKm);
    }

    
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Implement updateLocation() from GPS interface
    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }

    // Implement getCurrentLocation() from GPS interface
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
}


class Car extends Vehicle {
    // Constructor
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // Car uses the base rate
    }
}

class Bike extends Vehicle {
    // Constructor
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Implement calculateFare() for Bike
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; // Bike has a 20% discount
    }
}


class Auto extends Vehicle {
    // Constructor
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Implement calculateFare() for Auto
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9; // Auto has a 10% discount
    }
}





public class RideHailingApp {
    public static void main(String[] args) {
        // Create Car, Bike, and Auto objects
        Vehicle car = new Car("C101", "raj", 10.0);
        Vehicle bike = new Bike("B202", "rohan", 5.0);
        Vehicle auto = new Auto("A303", "john", 7.0);

        // Update locations
        car.updateLocation("punjab");
        bike.updateLocation("chandigarh");
        auto.updateLocation("delhi");

        // Use polymorphism to handle different vehicle types
        displayVehicleDetails(car, 50.0);
        displayVehicleDetails(bike, 30.0);
        displayVehicleDetails(auto, 40.0);
    }

    // Polymorphic method to display vehicle details and fare
    public static void displayVehicleDetails(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Current Location: " + vehicle.getCurrentLocation());
        System.out.printf("Fare for %.2f km: $%.2f%n", distance, vehicle.calculateFare(distance));
        System.out.println();
    }
}