package Library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

       
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);
        library2.addBook(book1); 

        
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}
