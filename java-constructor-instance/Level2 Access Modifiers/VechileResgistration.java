package Level2;

// Create a Vehicle class to manage the details of vehicles:
// Instance Variables: ownerName, vehicleType.
// Class Variable: registrationFee (fixed for all vehicles).
// Methods:
// An instance method displayVehicleDetails() to display owner and vehicle details.
// A class method updateRegistrationFee() to change the registration fee.

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1200;

    // parematrized constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Ownername: " + ownerName);
        System.out.println("vehicleType: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static boolean updateRegistrationFee(double newfee) {
        if (newfee > 0) {
            registrationFee = newfee;
        } else {
            System.out.println("fee must be valid");
            return false;
        }
        return true;
    }

}

public class VechileResgistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Deepak", "car");
        Vehicle v2 = new Vehicle("ritick", "truck");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(3000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

    }
}
