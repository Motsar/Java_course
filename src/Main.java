

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = new Box(5);
        Box box3 = new Box(2.5);
        Box box4 = new Box(2.5);

        box3.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box4.add( new Book("Robert Martin", "Clean Code", 1) );
        box4.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box4.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box4.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box4.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );
        box2.add(box4);
        box2.add(box3);
        box.add(box2);

        System.out.println( box );
    }
}

