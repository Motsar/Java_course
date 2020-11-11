import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;

    public Library(){
        this.library= new ArrayList<>();
    }

    public void addBook(Book newBook) {
        this.library.add(newBook);
    }

    public void printBooks() {
        for (Book book: this.library) {
            System.out.println(book);
        }
    }
}
