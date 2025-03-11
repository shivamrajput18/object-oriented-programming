package Java_Encapsulation_Polymophism;



// Reservable interface
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Getter methods
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Book class (implements Reservable)
class Book extends LibraryItem implements Reservable {
    private String borrowerName; // Encapsulated field

    Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // Books can be loaned for 21 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        this.borrowerName = borrowerName;
        System.out.println("Book reserved by: " + borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return borrowerName == null; // Available if borrowerName is null
    }
}

// Magazine class
class Magazine extends LibraryItem {
    Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }
}

// DVD class (implements Reservable)
class DVD extends LibraryItem implements Reservable {
    private String borrowerName; // Encapsulated field

    DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // DVDs can be loaned for 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        this.borrowerName = borrowerName;
        System.out.println("DVD reserved by: " + borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return borrowerName == null; // Available if borrowerName is null
    }
}

// Main class to demonstrate the library management system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a list of library items
        LibraryItem[] items = {
            new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Magazine("M001", "National Geographic", "Various Authors"),
            new DVD("D001", "Inception", "Christopher Nolan")
        };

        // Process each library item
        for (LibraryItem item : items) {
            System.out.println("\nProcessing Item:");
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Check if the item is reservable
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem("Alice");
                } else {
                    System.out.println("Item is already reserved.");
                }
            }
        }
    }
}