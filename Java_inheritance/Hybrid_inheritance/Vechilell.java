package Java_inheritance.Hybrid_inheritance;


// Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
// Tasks:
// Define a superclass Vehicle with attributes like maxSpeed and model.
// Create an interface Refuelable with a method refuel().
// Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
// Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.


class Vechile{
    protected int maxSpeed;
    protected String model;

    Vechile(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

}

interface Refuelable{

    void refuel();
}

class ElectricVehicle extends Vechile {
    private String name;
    ElectricVehicle(int maxSpeed, String model, String name){
        super(maxSpeed, model);
        this.name = name;
    }

    
    public void charge() {
        // TODO Auto-generated method stub
        System.out.println("charging");
    }

}

class PetrolVehicle extends Vechile implements Refuelable{
    private String name;
    PetrolVehicle(int maxSpeed, String model, String name){
        super(maxSpeed, model);
        this.name = name;
    }
    @Override
    public void refuel() {
        // TODO Auto-generated method stub
        System.out.println("Give me petrol");
    }
}


public class Vechilell {
    public static void main(String[] args) {
        ElectricVehicle e1 = new ElectricVehicle(90, "TATA", "Tata electric");
        e1.charge();

        PetrolVehicle p1 = new PetrolVehicle(100, "tata", "travtor");
        p1.refuel();

    }
}
