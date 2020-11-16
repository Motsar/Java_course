import java.util.ArrayList;

public class Hand{
    private ArrayList<Card> hand= new ArrayList<>();

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card : this.hand) {
            System.out.println(card);
        }
    }


}

