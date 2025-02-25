
public class Circle {
    private double radius;
    
    Circle(){
        this(2.3); // constructor channing
    }

    Circle(Double rad){
        this.radius = rad;
    }

   

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.radius);

        Circle c2 = new Circle(4.5);
        System.out.println(c2.radius);
    }
    
}