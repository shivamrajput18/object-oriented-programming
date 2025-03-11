package Company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name){
        this.name = name;
        this.departments = new ArrayList<>();
    }

    void addDepartments(Department dept){
        departments.add(dept);
    }

    void CompanyStructure(){
        for(Department dept : departments){
            dept.displayDepartment();
        }
    }


}
