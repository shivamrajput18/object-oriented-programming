package Level2;

// Design a Course class with:
// Instance Variables: courseName, duration, fee.
// Class Variable: instituteName (common for all courses).
// Methods:
// An instance method displayCourseDetails() to display the course details.
// A class method updateInstituteName() to modify the institute name for all courses.

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Chitkara";

    // parematrized constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Cousrsename: " + this.courseName);
        System.out.println("Duration(in yrs): " + this.duration);
        System.out.println("Fee: " + this.fee);
        System.out.println("InstituteName: " + instituteName);
    }

    static void updateInstituteName(String updateName) {
        instituteName = updateName;
    }

}

public class OnlineFee {
    public static void main(String[] args) {
        Course c1 = new Course("cse", 4, 60000);
        Course c2 = new Course("pharma", 4, 90000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("cu");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
