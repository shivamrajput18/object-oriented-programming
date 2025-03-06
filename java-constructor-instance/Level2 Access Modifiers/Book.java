package Level2;

// Design a Book class with:

// ISBN (public).
// title (protected).
// author (private).
// Write methods to:
// Set and get the author name.
// Create a subclass EBook to access ISBN and title and demonstrate access modifiers.

public class Book {
    public String ISBN;
    protected String title;
    private String author;

    // parematrized constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    // parematrized constructor
    EBook(String ISBN, String title, String author) {

        super(ISBN, title, author); // call parent constructor
    }

    // Display book details
    public void displayEBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("title: " + title);
        System.out.println("author: " + getAuthor()); // author is private cant acess in subclass
    }

}

class Main {
    public static void main(String[] args) {
        
        EBook b1 = new EBook("123B00", "ABC", "Raj");
        // b1.ISBN;
        b1.displayEBook();

    }

}