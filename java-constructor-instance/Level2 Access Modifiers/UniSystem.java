package Level2;

// Problem 1: University Management System
// Create a Student class with:
// rollNumber (public).
// name (protected).
// CGPA (private).
// Write methods to:
// Access and modify CGPA using public methods.
// Create a subclass PostgraduateStudent to demonstrate the use of protected members.

class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    // parematrized constructor
    Student(String name, int rollNumber, double CGPA) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.CGPA = CGPA;
    }

    // Method to modify the CGPA
    public void modifyCGPA(double newCGPA) {
        this.CGPA = newCGPA;
    }

    // Display the student details
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("RollNumber: " + rollNumber);
        System.out.println("CGPA: " + CGPA);
    }

}

class PostgraduateStudent extends Student {
    // parematrized constructor
    PostgraduateStudent(String name, int rollNumber, double cgpa) {
        super(name, rollNumber, cgpa); // call the super sonstructor
    }

    public void displayPostgraduateStudentDetails() {

        System.out.println("Name: " + name); // as it protectec it can be access
        System.out.println("RollNumber: " + rollNumber);
        // System.out.println("CGPA: "+ CGPA); // as it private it connot be access
    }

}

public class UniSystem {
    public static void main(String[] args) {
        Student s1 = new Student("deepak", 413, 8.7);
        s1.displayStudentDetails();
        System.out.println(s1.name);

        PostgraduateStudent sub = new PostgraduateStudent("rohit", 200, 8.8);
        System.out.println(sub.name);
        sub.displayPostgraduateStudentDetails();

    }
}
