package Java_Encapsulation_Polymophism;


import java.util.ArrayList;
import java.util.List;

// Interface

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract Class
// Use an abstract class Employee with fields like employeeId, name, and
// baseSalary.
// Provide an abstract method calculateSalary() and a concrete method
// displayDetails().

abstract class Employee {
    private String employeeId;
    private String name;
    private int baseSalary;

    Employee(String employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract int calculateSalary();

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void displayDetails() {
        System.out.println("Emp id: " + employeeId);
        System.out.println("Name : " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// subclasses FullTimeEmployee and PartTimeEmployee

class FullTimeEmployee extends Employee implements Department {

    private String department;

    FullTimeEmployee(String employeeId, String name, int baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    int calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return this.department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + this.department);
    }

}

class PartTimeEmployee extends Employee implements Department {

    private int hourPay;
    private int workedHour;
    private String department;

    PartTimeEmployee(String employeeId, String name, int hourPay, int workedHour) {
        super(employeeId, name, 0);
        this.hourPay = hourPay;
        this.workedHour = workedHour;

    }

    @Override
    public int calculateSalary() {
        return hourPay * workedHour;
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return this.department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Worked Hours: " + workedHour);
        System.out.println("Hourly Pay: " + hourPay);
        System.out.println("Department: " + department);
    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee e1 = new FullTimeEmployee("E1099", "deepak", 20000);
        e1.assignDepartment("HR");

        PartTimeEmployee p1 = new PartTimeEmployee("P1023", "Ritick", 100, 20);
        p1.assignDepartment("SDE");

        employees.add(e1);
        employees.add(p1);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("---------------------");
        }
        
    }
}
