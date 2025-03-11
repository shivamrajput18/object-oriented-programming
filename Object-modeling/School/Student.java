package School;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;
    

    Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }

   public  void enroll(Course course){
        courses.add(course);
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }
    public void displayEnrolledCourses(){
        System.out.println("Name" + this.name);
        for(Course x: courses)
        {
            System.out.println("Course: "+ x.getName());
        }
    }

}
