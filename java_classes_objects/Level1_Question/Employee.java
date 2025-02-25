package Level1_Question;

// Program to Display Employee Details
// Problem Statement:
//  Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.

public class Employee {

    private String name;
    private int id;
    private int salary;

    // Constructor
    Employee(int id, String name, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println(salary);
    }

    // Display the details
    void display() {
        System.out.println("Id is " + this.id + "\nName is " + this.name + "\nSalary is " + this.salary);
    }

    public static void main(String[] args) {
        // Creating a Employee object
        Employee e1 = new Employee(1001, "Deepak", 1000000);
        Employee e2 = new Employee(1001, "Deepak", 1000000);

    }
}
