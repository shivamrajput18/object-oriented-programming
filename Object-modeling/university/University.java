package university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayFaculties() {
        System.out.println("University: " + name);
        for (Faculty fac : faculties) {
            System.out.println(fac.getName());
        }
    }

    public void displayDepartments() {
        System.out.println("University: " + name);
        for (Department dep : departments) {
            System.out.println(dep.getName());
        }
    }

}
