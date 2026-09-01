import java.util.ArrayList;

class Book {
    int bookId;
    String bookName;
    String authorName;
    // Parameterized constructor
    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
    // Display book details
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println();
    }
}
public class Books {
        public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(101, "Java Programming", "James Gosling"));
        books.add(new Book(102, "Python Programming", "Guido van Rossum"));
        books.add(new Book(103, "C Programming", "Dennis Ritchie"));
        System.out.println("Book Details:");
        for (Book b : books) {
           System.out.println("Book ID: " + b.bookId);
           System.out.println("Book Name: " + b.bookName);  
           System.out.println("Author Name: " + b.authorName);   
    }
}
}
