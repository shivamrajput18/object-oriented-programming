package Level1_Question;

public class Circle {
    private static final double PI = 3.14;
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculate the area
    public double calculateArea() {
        return PI * radius * radius;
    }

    // Calculate the circumference
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    // Display the details
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    @Override
    public String toString() {

        return "radius " + this.radius;
    }

    public static void main(String[] args) {
        // Creating the circle object
        Circle circle = new Circle(5);
        // circle.display();
        System.out.println(circle);
    }
}
