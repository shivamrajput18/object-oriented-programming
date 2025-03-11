package Java_inheritance.Hybrid_inheritance;

// Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
// Tasks:
// Define a superclass Person with attributes like name and id.
// Create an interface Worker with a method performDuties().
// Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().


class Person{
    protected String name;
    protected int id;

    Person(String name, int id){
        this.name = name;
        this.id  = id;
    }

     void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker{

    private String specialty;

    Chef(String name, int id, String specialty){
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is preparing " + specialty + " dishes.");
    }
}

class Waiter extends Person implements Worker{
    private int tableNumber;

    Waiter(String name, int id,int tableNumber ){
        super(name, id);
        this.tableNumber = tableNumber;
    }

    @Override
    public void performDuties() {
        // TODO Auto-generated method stub
        System.out.println(name + "(Waiter) is serving " + tableNumber +" Table" );
    }
}



public class Restaurant_Management {
    public static void main(String[] args) {
        
        Chef c1 = new Chef("Deepak", 12345,"Indian cuisine");
        c1.displayInfo();
        c1.performDuties();

        Waiter w1 = new Waiter("Pandey", 214 , 21);
        w1.displayInfo();
        w1.performDuties();




    }
}
