package Java_inheritance.single_inherritance;

// Sample Problem 1: Library Management with Books and Authors
// Description: Model a Book system where Book is the superclass, and Author is a subclass.
// Tasks:
// Define a superclass Book with attributes like title and publicationYear.
// Define a subclass Author with additional attributes like name and bio.
// Create a method displayInfo() to show details of the book and its author.
// Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.



class Book {
    protected String title;
    protected int publicationYear;

    // Constructor
    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // display the title and publication Year
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("PublicationYear: " + publicationYear);
    }
    
}


class Author extends Book{
    private String name;
    private String bio;

    // Constructor
    Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    
    @Override
    public void display() {
        super.display();
        System.out.println("Author: "+ name);
        System.out.println("Bio: "+ bio);
    }

}


public class Library_Management {
    
    public static void main(String[] args) {
        Author author = new Author("The Art of Java", 2022, "John Doe", "A renowned Java developer and writer.");
        author.display();
    }
}
