package Level2_Question;

// Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
// To calculate the grade based on the marks.
// To display the student's details and grade.
// Explanation: The Student class organizes all relevant details about a student as attributes. Methods are used to calculate the grade and provide a way to display all information.

public class Student {
    private String name;
    private String rollNumber;
    private int marks;

    // Constructor
    public Student(String name, String rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the Grade
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    // Display the Student details
    public void displayDetails() {
        String grade = calculateGrade();
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Creating the Student onject
        Student student1 = new Student("Rohit", "400", 88);
        student1.displayDetails();
    }
}
