package university;

public class Main {
    public static void main(String[] args) {
        University university = new University("Chitkara");

        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Electronics");

        Faculty fac1 = new Faculty("CSE");
        Faculty fac2 = new Faculty("ECE");

        university.addDepartment(dept1);
        university.addDepartment(dept2);

        university.addFaculty(fac1);
        university.addFaculty(fac2);

        university.displayDepartments();
        university.displayFaculties();


    }
}
