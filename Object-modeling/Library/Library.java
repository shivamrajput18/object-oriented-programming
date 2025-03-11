package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String  name;
    private List<Book> Books;

    Library(String name){
        this.name = name;
        this.Books = new ArrayList<>();
    }

    void addBook(Book book){
        Books.add(book);
    }

    void displayBooks(){
        for(Book b: Books){
            System.out.println(b);
        }
    }

    
}
