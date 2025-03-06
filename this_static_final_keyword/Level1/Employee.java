package Level1;
public class Employee {
    private static String companyName = "Tech Corp"; // Static variable
    private static int totalEmployees = 0; // Static counter
    private final int id; // Final variable
    private String name;
    private String designation;


    public Employee(int id, String name, String designation) {
       this.id = id;
       this.name = name;
       this.designation = designation;
       totalEmployees++;
    }

  

    void displayAccountDetails() {
        if (this instanceof Employee) {

            System.out.println("Account id: " + id);
            System.out.println("Account Holder: " + name);
            System.out.println("Account Designation: " + designation);
        }

    }

    void displayTotalemployee(){
        System.out.println("Total emoployees"+totalEmployees);
    }

}

class emp {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Aman", "Software Engineer");
    
        Employee emp2 = new Employee(2, "Adarsh", "Manager");

        emp1.displayAccountDetails();

    }

}