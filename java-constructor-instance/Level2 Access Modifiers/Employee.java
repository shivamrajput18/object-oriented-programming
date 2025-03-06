package Level2;

// Develop an Employee class with: employeeID (public). department (protected). salary (private). 
//Write methods to: Modify salary using a public method. Create a subclass Manager to access employeeID and department.

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // parematrized constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    // Display the Employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    // parematrized constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Display the Manager Details
    public void displayManagerDetails() {
        System.out.println("Manager Employee ID: " + employeeID);
        System.out.println("Department: " + department);

        System.out.println("Salary: " + getSalary()); // salary is private cant access in subclass
    }
}

class emp {
    public static void main(String[] args) {
        // Creating the manager object
        Manager m1 = new Manager(101, "Hr", 1000000);
        m1.displayEmployeeDetails();
    }
}