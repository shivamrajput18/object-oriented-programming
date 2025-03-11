package School;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Student> students;
    Course(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student stu){
        students.add(stu);
        
    }
    public String getName() {
        return name;
    }

    public void displayenrollStudent(){
        System.out.println("Course: "+ this.name);
        for(Student stu: students){
            System.out.println("Name: "+stu.getName());
        }
    }

}
