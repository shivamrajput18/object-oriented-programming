public class Person {
    private String name;
    private int age;

    Person(){
        this.name = "";
        this.age = 0;

    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    
    // Copy constructor (Clones another Person object)
    Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }

     // Getters
     public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayPerson(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
       Person p = new Person("Shivam",23); 
       p.displayPerson();

       System.out.println();

       Person p1 = new Person("Rajput",27); 
       p1.displayPerson();

       System.out.println();

       System.out.println("   Copy Constructor  ");
       Person copyPerson = new Person(p);
       copyPerson.displayPerson();

    }
}
