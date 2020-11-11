public class Book {
    String title;
    String publisher;
    int year;


    public Book(String someTitle,String somePublisher, int aYear){
        this.title = someTitle;
        this.publisher = somePublisher;
        this.year = aYear;
    }

    public String title(){
        return title;
    }

    public String publisher(){
        return publisher;
    }

    public int year(){
        return year;
    }

    public String toString() {
        return title + ',' + publisher+ ',' + year;
    }

}
