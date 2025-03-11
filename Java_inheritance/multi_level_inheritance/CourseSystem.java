package Java_inheritance.multi_level_inheritance;

// Base class: Course
class Course {
    protected String courseName;
    protected int duration; // Duration in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse extends Course
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse extends OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // Percentage discount

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalPrice() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + getFinalPrice());
    }
}

// Main class to test
public class CourseSystem {
    public static void main(String[] args) {
        System.out.println("=== Free Online Course ===");
        OnlineCourse freeCourse = new OnlineCourse("Java Basics", 6, "Udemy", true);
        freeCourse.displayCourseInfo();

        System.out.println("\n=== Paid Online Course ===");
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 12, "Coursera", true, 199.99, 20);
        paidCourse.displayCourseInfo();
    }
}
