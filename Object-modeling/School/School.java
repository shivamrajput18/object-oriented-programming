package School;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + name);
        for (Student stu : students) {
            stu.displayEnrolledCourses();
        }
    }
}
