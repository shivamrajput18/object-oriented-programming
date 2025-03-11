package Company;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String emp){
        employees.add(new Employee(emp));
    }

    void displayDepartment(){
        System.out.println("Department: " + this.name);

        for(Employee emp : employees){
            System.out.println("Employee: " + emp.getName());
        }
    }


}
