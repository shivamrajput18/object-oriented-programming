package Java_Encapsulation_Polymophism;


// Vehicle Rental System
// Description: Design a system to manage vehicle rentals:
// Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
// Add an abstract method calculateRentalCost(int days).
// Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
// Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
// Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
// Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.

interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

abstract class Vehicle {
    private int vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(int vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getter methods
    public double getRentalRate() {
        return rentalRate;
    }

    public String getType() {
        return type;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    private String name;
    private String insurencePolicyNumber;

    Car(String name, int vehicleNumber, String type, double rentalRate, String insurencePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.name = name;
        this.insurencePolicyNumber = insurencePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days) {

        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        // Insurance cost is 5% of the total rental cost for 1 day
        return 0.05 * getRentalRate();
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy Number: " + insurencePolicyNumber + ", Insurance Cost: Rs," + calculateInsurance();
    }

}

class Bike extends Vehicle {
    private String name;

    Bike(String name, int vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
        this.name = name;
    }

    @Override
    double calculateRentalCost(int days) {

        return days * getRentalRate();
    }

}

class Truck extends Vehicle implements Insurable {
    private String name;
    private String insurencePolicyNumber;

    Truck(String name, int vehicleNumber, String type, double rentalRate, String insurencePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.name = name;
        this.insurencePolicyNumber = insurencePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days) {

        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        // TODO Auto-generated method stub
        return 0.1 * getRentalRate();
    }

    @Override
    public String getInsuranceDetails() {
        // TODO Auto-generated method stub
        return "Truck Insurance Policy Number: " + insurencePolicyNumber + ", Insurance Cost: Rs," + calculateInsurance();
    }

}

public class VechileRental {
    public static void main(String[] args) {
        Vehicle[] Vehicles = {
            new Car("Sedan", 101, "Car", 50.0, "INS12345"),

            new Bike("Sport Bike", 201, "Bike", 20.0),
            new Truck("Heavy Duty", 301, "Truck", 100.0,"TNS10045")
        };

        for(Vehicle vehicle: Vehicles){
            int rentalDays = 5;
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Cost for " + rentalDays + " days: Rs," + rentalCost);
            
            if(vehicle instanceof Insurable){
                Insurable InsurableVehicle = (Insurable) vehicle;
                
                System.out.println(InsurableVehicle.getInsuranceDetails());
            }

            System.out.println();

        }


    }
}
