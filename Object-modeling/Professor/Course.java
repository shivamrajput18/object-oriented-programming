package Professor;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Professor professor;
    private List<Student> students;

    public Course(String name, Professor professor) {
        this.name = name;
        this.professor = professor;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void showDetails() {
        System.out.println("Course: " + name);
        System.out.println("Professor: " + professor.getName());
        System.out.println("Students: ");
        for (Student stu : students) {
            System.out.println(stu.getName());
        }
    }
       
}
