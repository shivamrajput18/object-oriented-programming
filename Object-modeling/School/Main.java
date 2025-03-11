package School;

public class Main {
    public static void main(String[] args) {
        School Areca = new School("Areca");

        Student s1= new Student("Ritic");
        Student s2= new Student("deepak");

        Course math = new Course("Mathematics");
        Course Science = new Course("science");

        Areca.addStudent(s1);
        Areca.addStudent(s2);

        s1.enroll(Science);
        s2.enroll(Science);
        s2.enroll(math);
        
        Areca.displayStudents();

        math.displayenrollStudent();


    }
}
