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

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book: this.library) {
            if(book.title().contains(title)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book: this.library) {
            if(book.publisher().contains(publisher)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book: this.library) {
            if(book.year()==year){
                found.add(book);
            }
        }
        return found;
    }

}
