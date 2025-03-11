package Java_inheritance.Hierarchical_Inheritance;


class Person{
    protected String name;
    protected int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

class Teacher extends Person{
    private String subject;

    Teacher(String name, int age,String subject){
        super(name, age);
        this.subject = subject;
    }

    void displayRole(){
        System.out.println("Role: Teachers");
        System.out.println("Subject" + this.subject);
    }
}

class Student extends Person{
    private int grade;

    Student(String name, int age,int grade){
        super(name, age);
        this.grade = grade;
    }

    void displayRole(){
        System.out.println("Role: Students");
        System.out.println("Grade: "+ this.grade);
    }
}

class Staff extends Person{
    private String department;

    Staff(String name, int age,String department){
        super(name, age);
        this.department = department;
    }

    void displayRole(){
        System.out.println("Role: Staff");
        System.out.println("Department: "+ this.department);
    }
}


public class SchoolSystem {
    public static void main(String[] args) {
        
        System.out.println("=== Teacher Details ===");
        Teacher teacher = new Teacher("Dr. Bilty", 40, "Mathematics");
        teacher.displayInfo();
        teacher.displayRole();

        System.out.println("\n=== Student Details ===");
        Student student = new Student("Ritick kumar", 16, 10);
        student.displayInfo();
        student.displayRole();

        System.out.println("\n=== Staff Details ===");
        Staff staff = new Staff("Ms. Ronny", 50, "Administration");
        staff.displayInfo();
        staff.displayRole();
    }
}
