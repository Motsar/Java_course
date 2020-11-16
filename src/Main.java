import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hand fullHouse = new Hand();

        fullHouse.add( new Card(14, Card.SPADES) );
        fullHouse.add( new Card(14, Card.CLUBS) );
        fullHouse.add( new Card(14, Card.HEARTS) );
        fullHouse.add( new Card(13, Card.CLUBS) );
        fullHouse.add( new Card(13, Card.DIAMONDS) );

        fullHouse.print();
    }
}

