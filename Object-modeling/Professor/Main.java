package Professor;

public class Main {
    public static void main(String[] args) {
        // Create a new professor
        Professor p1 = new Professor("newton");
        
        // Create a new course
        Course cs = new Course("CS101", p1);

        // create a student
        Student s1 = new Student("Ritick");
        Student s2 = new Student("Rohit");
        
        // Add the course to the professor
        cs.assignProfessor(p1);
        cs.enrollStudent(s1);
        cs.enrollStudent(s2);
        cs.showDetails();
    }
}
