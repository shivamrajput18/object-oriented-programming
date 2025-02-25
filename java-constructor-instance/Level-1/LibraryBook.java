// LibraryBook System


public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor
    public LibraryBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.isAvailable = true; // Default to available
    }

    // Parameterized constructor
    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book \"" + title + "\" has been borrowed.");
            return true;
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
            return false;
        }
    }

    // Method to return a book
    public void returnBook() {
        isAvailable = true;
        System.out.println("The book \"" + title + "\" has been returned and is now available.");
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $ " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Creating a book object
        LibraryBook book1 = new LibraryBook("DEATH", "SADHGURU", 300, true);

        // Displaying book details
        book1.displayBook();
        System.out.println();

        // Borrowing the book
        book1.borrowBook();
        System.out.println();

        // Trying to borrow the same book again
        book1.borrowBook();
        System.out.println();

        // Returning the book
        book1.returnBook();
        System.out.println();

        // Borrowing the book again after returning
        book1.borrowBook();
    }
}
